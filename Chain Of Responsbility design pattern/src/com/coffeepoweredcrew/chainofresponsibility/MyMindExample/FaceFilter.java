package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

public class FaceFilter extends Filter {

	public FaceFilter( Filter nextSuccessor) {
		super("faceFilter", nextSuccessor);
	}

	@Override
	public boolean processTheRequest(Request request) {
		request.getApprovedBy().add(getCurrentFilter());
		System.out.println(request);
		return true;
	}

}
