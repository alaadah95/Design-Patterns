package com.learning.myexample.nonTerminal;

import com.learning.myexample.Formula;
import com.learning.myexample.context.UserContext;
//non-Terminal Expression
public class DivideExpression implements Formula {
	private Formula f1;
	private Formula f2;

	public DivideExpression(Formula f1, Formula f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public double interupt(UserContext context) {
		double result = f2.interupt(context);
		if (result == 0)
			throw new ArithmeticException("Can not divide by Zero");
		return f1.interupt(context) / result;
	}

}
