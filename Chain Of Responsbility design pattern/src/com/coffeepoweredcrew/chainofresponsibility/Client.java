package com.coffeepoweredcrew.chainofresponsibility;

import java.time.LocalDate;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.LOP)
				.from(LocalDate.now()).to(LocalDate.of(2025, 2, 5))
				.build();
		Employee leader = setupTheChain();
		leader.processLeaveApplication(application);
		System.out.println( "status ==> "+ application.getStatus() +" "+ application.getProcessedBy());
	}  
	
	public static Employee setupTheChain() {
		Employee director = new Director(null);
		Employee manager = new Manager(director);
		Employee leader = new ProjectLead(manager);
		return leader;
	}    
}
