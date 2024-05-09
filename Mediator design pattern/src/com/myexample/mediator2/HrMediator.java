package com.myexample.mediator2;

import java.util.ArrayList;
import java.util.List;

public class HrMediator implements Mediator {
	
	private List<Colleague> groupOfColleagues = new ArrayList<>();	
	@Override
	public void addColleague(Colleague colleague) {
		groupOfColleagues.add(colleague);
	}
	@Override
	public void notify(Colleague colleague) {
		// notify all your college
		groupOfColleagues.stream().filter(col -> col != colleague )
		.forEach(col -> colleague.receive(colleague) );
	}

	 
}
