package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

public class SecurityFilter extends Filter {

	public SecurityFilter(Filter nextSuccessor) {
		super("SecurityFilter", nextSuccessor);
	}

	@Override
	public boolean processTheRequest(Request request) {
		if(request.getRequesterAge() > 15) {
			request.getApprovedBy().add(getCurrentFilter());
			System.out.println(request);
			return true;
		}
		request.setRejectedBy(getCurrentFilter());
		System.out.println(request);
		return false;
	}

}
