package com.learning.myexample.parsing;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learning.myexample.Formula;
import com.learning.myexample.nonTerminal.AddExpression;
import com.learning.myexample.nonTerminal.DivideExpression;
import com.learning.myexample.nonTerminal.MultiExpression;
import com.learning.myexample.nonTerminal.SubExpression;
import com.learning.myexample.terminal.AgeExpression;
import com.learning.myexample.terminal.NumberExpression;

public class MathExpressionBuilder {
	private Stack<Formula> formulas = new Stack<>();
	private Stack<String> operators = new Stack<>();

	public Formula buildTheFormula(String expression) {
		if (expression.isEmpty())
			throw new RuntimeException("no expression provided.");
		parseExpression(expression);
		//*** read from left to right ***//
		//comment this two lines if you want to read from right to left 
		reverseIntegerStackAsFormula(formulas);
		reverseIntegerStack(operators);
		//****///
		buildExpression();
		return formulas.pop();
	}

	private void buildExpression() {
		while (!operators.isEmpty()) {

			String value = operators.pop();
			switch (value) {
			case "divide": {
				Formula f1 = formulas.pop();
				Formula f2 = formulas.pop();
				formulas.push(new DivideExpression(f1, f2));
				break;
			}
			case "multi": {
				Formula f1 = formulas.pop();
				Formula f2 = formulas.pop();
				formulas.push(new MultiExpression(f1, f2));
				break;
			}
			case "minus": {
				Formula f1 = formulas.pop();
				Formula f2 = formulas.pop();
				formulas.push(new SubExpression( f1,f2 ));
				break;
			}
			case "pluse": {
				Formula f1 = formulas.pop();
				Formula f2 = formulas.pop();
				formulas.push(new AddExpression(f2, f1));
				break;
			}
			default:
				throw new IllegalArgumentException("Unknown operator:" + value);
			}
		}
	}

	private void parseExpression(String expression) {

		List<String> expressionAsArray = Stream.of(expression.split(" ")).collect(Collectors.toList());

		for (int i = 0; i < expressionAsArray.size(); i++) {
			switch (expressionAsArray.get(i)) {
			case "divide": {
				operators.push("divide");
				break;
			}
			case "multi": {
				operators.push("multi");
				break;
			}
			case "minus": {
				operators.push("minus");
				break;
			}
			case "pluse": {
				operators.push("pluse");
				break;
			}
			case "age": {
				formulas.push(new AgeExpression());
				break;
			}
			default:
				formulas.push(new NumberExpression(Double.parseDouble(expressionAsArray.get(i))));
			}
		}

	}
	
	public Stack reverseIntegerStack(Stack<String> inputStack) {
	    Queue<String> queue = new LinkedList<>();
	    while (!inputStack.isEmpty()) {
	        queue.add(inputStack.pop());
	    }
	    while (!queue.isEmpty()) {
	        inputStack.add(queue.remove());
	    }
	    return inputStack;
	}
	
	public Stack reverseIntegerStackAsFormula(Stack<Formula> inputStack) {
	    Queue<Formula> queue = new LinkedList<>();
	    while (!inputStack.isEmpty()) {
	        queue.add(inputStack.pop());
	    }
	    while (!queue.isEmpty()) {
	        inputStack.add(queue.remove());
	    }
	    return inputStack;
	}
	
	

}
