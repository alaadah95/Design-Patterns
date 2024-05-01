package com.learning.myexample.terminal;

import com.learning.myexample.Formula;
import com.learning.myexample.context.UserContext;

//Terminal Expression
public class AgeExpression implements Formula {

	public AgeExpression() {
	}

	@Override
	public double interupt(UserContext context) {
		return context.getAge();
	}

}
