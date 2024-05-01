package com.learning.myexample;

import com.learning.myexample.context.UserContext;
import com.learning.myexample.parsing.MathExpressionBuilder;

public class Client {

	public static void main(String[] args) {
		
		// Context
		UserContext context = new UserContext("Alaa", 29, 20);
		
		MathExpressionBuilder builder  = new MathExpressionBuilder();
		Formula formula =  builder.buildTheFormula("1 pluse 2 minus 1 multi age divide 2"); 
		System.out.println(formula.interupt(context)); 
		
//		MathExpressionBuilder builder  = new MathExpressionBuilder();
//		Formula formula =  builder.buildTheFormula("1 pluse 5 minus 6");
//		System.out.println(formula.interupt(context));  
//		
//		MathExpressionBuilder builder  = new MathExpressionBuilder();
//		Formula formula =  builder.buildTheFormula("age divide 2");
//		System.out.println(formula.interupt(context)); 
		
//		MathExpressionBuilder builder  = new MathExpressionBuilder();
//		Formula formula =  builder.buildTheFormula("age divide 2 pluse 5 minus 6");
//		System.out.println(formula.interupt(context)); 
		
	}

}
