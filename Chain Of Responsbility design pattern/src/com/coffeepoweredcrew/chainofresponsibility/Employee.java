package com.coffeepoweredcrew.chainofresponsibility;

 
public abstract class Employee  {

	String role;
	Employee nextSuccessor;

	public Employee(String role, Employee nextSuccessor) {
		this.role = role;
		this.nextSuccessor = nextSuccessor;
	}

	 
	public String getApproverRole() {
		return this.role;
	}

	 
	public void processLeaveApplication(LeaveApplication aaplication) {
		if(!processTheRequest(aaplication) && nextSuccessor != null)
			nextSuccessor.processLeaveApplication(aaplication);

	}
	
	protected abstract boolean processTheRequest(LeaveApplication application);

}