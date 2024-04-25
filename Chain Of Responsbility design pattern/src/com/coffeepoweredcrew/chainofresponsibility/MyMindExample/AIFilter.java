package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

public class AIFilter extends Filter {

	public AIFilter(Filter nextSuccessor) {
		super("aiFilter", nextSuccessor);
	}

	@Override
	public boolean processTheRequest(Request request) {
		if (!request.getRequesterName().contains("ai")) {
			request.getApprovedBy().add(getCurrentFilter());
			System.out.println(request);
			return true;
		}
		request.setRejectedBy(getCurrentFilter());
		System.out.println(request);
		return false;
	}

}
