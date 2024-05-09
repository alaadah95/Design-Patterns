package com.myexample.mediator2;

public class Client {

	public static void main(String[] args) {
		Mediator hr = new HrMediator();
		 Colleague me = new DeveloperColleague(hr, " alaa ");
		 Colleague col1 = new DeveloperColleague(hr, " mohamed ");
		 Colleague col2 = new DeveloperColleague(hr, " ahmed ");
		 
		 me.notifyMediator();

	}

}
