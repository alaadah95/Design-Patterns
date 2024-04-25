package com.coffeepoweredcrew.chainofresponsibility;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;
//A concrete handler
public class Director extends Employee {

	public Director(Employee nextApprover) {
		super("Director", nextApprover);
	}
	
	@Override
	protected boolean processTheRequest(LeaveApplication application) {
		if(application.getType() == Type.LOP) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}


	
}
