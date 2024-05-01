package com.learning.myexample.nonTerminal;

import com.learning.myexample.Formula;
import com.learning.myexample.context.UserContext;

//non-terminal
public class SubExpression implements Formula {
	private Formula f1;
	private Formula f2;

	public SubExpression(Formula f1, Formula f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public double interupt(UserContext context) {
		return f1.interupt(context) - f2.interupt(context);
	}
	
}
