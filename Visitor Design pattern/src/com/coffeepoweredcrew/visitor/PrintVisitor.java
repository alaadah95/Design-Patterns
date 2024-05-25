package com.coffeepoweredcrew.visitor;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(Programmer programmer) {
		System.out.println(" The programmer name "+programmer.getName() + " has rating "+programmer.getPerformanceRating()
		+" and his skill is "+programmer.getSkill());
		
	}

	@Override
	public void visit(ProjectLead lead) {
		System.out.println(" The ProjectLead name "+lead.getName() + " has rating "+lead.getPerformanceRating());
		
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(" The manager name "+manager.getName() + " has rating "+manager.getPerformanceRating());
		
	}

	@Override
	public void visit(VicePresident vp) {
		System.out.println(" The vic president name "+vp.getName() + " has rating "+vp.getPerformanceRating());
		
	}
	
}
