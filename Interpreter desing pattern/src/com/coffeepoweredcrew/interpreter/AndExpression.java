package com.coffeepoweredcrew.interpreter;

//Non-terminal expression 
public class AndExpression implements PermissionExpression {
	private PermissionExpression exp1;
	private PermissionExpression exp2;

	public AndExpression(PermissionExpression exp1, PermissionExpression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(User user) {

		return exp1.interpret(user) && exp2.interpret(user);
	}
	@Override
	public String toString() {
		return exp1 +" and "+exp1;
	}
}
