package com.coffeepoweredcrew.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		
		populateEmployeeData( adapter);
		
		BusinessCardDesigner designer = new BusinessCardDesigner();
		
		System.out.println( designer.designCard(adapter) );
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(employee);
		System.out.println( designer.designCard(adapter2) );
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
