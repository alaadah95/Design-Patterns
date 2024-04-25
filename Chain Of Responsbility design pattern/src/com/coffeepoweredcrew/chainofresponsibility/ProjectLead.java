package com.coffeepoweredcrew.chainofresponsibility;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;

//A concrete handler
public class ProjectLead extends Employee {

	public ProjectLead(Employee nextSuccessor) {
		super("Lead", nextSuccessor);
	}

	@Override
	protected boolean processTheRequest(LeaveApplication application) {
		 if(application.getType() == Type.Sick && application.getNoOfDays() <= 2 )
			 return true ;
		return false;
	}

}
