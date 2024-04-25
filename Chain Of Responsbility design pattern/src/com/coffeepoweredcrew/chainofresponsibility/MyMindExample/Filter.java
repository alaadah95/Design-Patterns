package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

public abstract class Filter {

	protected String filterName ;
	protected Filter nextSuccessor ;
	
	
	public Filter(String filterName, Filter nextSuccessor) {
		this.filterName = filterName;
		this.nextSuccessor = nextSuccessor;
	}
	
	public void startFilteration(Request request) {
		
		if(processTheRequest(request) && nextSuccessor != null)
			nextSuccessor.startFilteration(request);
	}
	
	public abstract boolean processTheRequest(Request request) ;
		
	 
	public String getCurrentFilter() {
		return this.filterName;
	}

}
