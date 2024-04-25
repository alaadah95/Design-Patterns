package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

import com.coffeepoweredcrew.chainofresponsibility.MyMindExample.Request.RequestType;

public class Client {

	public static void main(String[] args) {
	
		Request request = new Request();
		request.setRequesterName("Alaa");
		request.setDescribtion("give info");
		request.setRequesterAge(12);
		request.setType(RequestType.INQUIRE);
		
		Filter filters =  setupTheFiltersChain() ;
		filters.startFilteration(request);

	}
	public static Filter setupTheFiltersChain() {
		Filter securtiyFilter = new SecurityFilter(null);
		Filter AiFilter = new AIFilter(securtiyFilter);
		Filter faceFilter = new FaceFilter(AiFilter);
		return faceFilter ;
	}
}
