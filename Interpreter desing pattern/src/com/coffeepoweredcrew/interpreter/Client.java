package com.coffeepoweredcrew.interpreter;

public class Client {

	public static void main(String[] args) {
		Report report = new Report("report1", "ADMIN and USER and CHIEF");
		ExpressionBuilder expressionBuilder = new ExpressionBuilder();
		PermissionExpression  permission = expressionBuilder.build(report);
		
		//Context 
		User userTryToAccessTheReport = new User("Alaa", "ADMIN" , "SUPER ADMIN","USER");
		
		boolean result = permission.interpret(userTryToAccessTheReport);
		
		System.out.println("Is the user has an access => "+result);
	}

}
