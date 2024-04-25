package com.coffeepoweredcrew.chainofresponsibility;
//A concrete handler

public class Manager extends Employee {

	public Manager(Employee nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	protected boolean processTheRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}
	
}