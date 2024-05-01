package com.learning.myexample.terminal;

import com.learning.myexample.Formula;
import com.learning.myexample.context.UserContext;

//Terminal Expression
public class NumberExpression implements Formula {
	
	private double number ;

	public NumberExpression(double number) {
		this.number = number;
	}

	@Override
	public double interupt(UserContext context) {
		return number;
	}
	
	
}
