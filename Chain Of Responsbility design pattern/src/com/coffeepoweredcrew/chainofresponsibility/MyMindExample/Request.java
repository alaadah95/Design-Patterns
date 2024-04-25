package com.coffeepoweredcrew.chainofresponsibility.MyMindExample;

import java.util.ArrayList;
import java.util.List;

public class Request {
	public enum RequestType {
		PAY, INQUIRE
	}
	private String requesterName;
	private int requesterAge;
	private String describtion;
	private RequestType type;
	private List<String> approvedBy = new ArrayList<String>();
	private String rejectedBy;
	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public int getRequesterAge() {
		return requesterAge;
	}

	public void setRequesterAge(int requesterAge) {
		this.requesterAge = requesterAge;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}

	 

	public List<String> getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(List<String> approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getRejectedBy() {
		return rejectedBy;
	}

	public void setRejectedBy(String rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	@Override
	public String toString() {
		return "Request [requesterName=" + requesterName + ", requesterAge=" + requesterAge + ", describtion="
				+ describtion + ", type=" + type + ", approvedBy=" + approvedBy + ", rejectedBy=" + rejectedBy + "]";
	}

	 

}
