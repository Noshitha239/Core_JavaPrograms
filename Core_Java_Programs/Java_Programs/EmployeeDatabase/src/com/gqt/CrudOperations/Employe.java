package com.gqt.CrudOperations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;

class Employee{
	int employeeId;
	String employeename;
	int employeesalary;

	public Employee(int employeeId, String employeename, int employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}


	public int getEmployeesalary() {
		return employeesalary;
	}


	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + ", employeesalary="
				+ employeesalary + "]";
	}
}
public class Employe{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		ArrayList<Employee> employee = new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		do
		{
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");

			choice=sc.nextInt();
			switch(choice) {
			case 1:

				System.out.println("eneter the Employee id");
				int employeeId=sc.nextInt();
				System.out.println("eneter the Employee name");
				String employeename=sc1.nextLine();
				System.out.println("eneter the Employee salary");
				int employeesalary=sc.nextInt();

				Employee e=new Employee(employeeId,employeename,employeesalary);
				employee.add(e);
				System.out.println("employee details added sucessfully");
				break;

			case 2:
				Iterator<Employee> itr=employee.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;

			case 3:
				boolean status=false;
				System.out.println("enter the employee id");
				int employeeId2 = sc.nextInt();
				Iterator<Employee> itr1=employee.iterator();
				while(itr1.hasNext()) {
					Employee e1=itr1.next();
					if(e1.getEmployeeId()==employeeId2) {
						System.out.println(e1);
						status=true;
					}
				}
				if(status==false) {
					System.out.println("employee details not found");
				}
				break;
			case 4:
				boolean status1=false;
				System.out.println("enter the employee id");
				int employeeId3 = sc.nextInt();
				ListIterator<Employee> litr2=employee.listIterator();
				while(litr2.hasNext()) {
					Employee e1=litr2.next();
					if(e1.getEmployeeId()==employeeId3) {
						System.out.println("Please enter the new Name");
						String newName=sc1.nextLine();
						System.out.println("Please enter the new Salary");
						int newSalary=sc.nextInt();
						Employee e2=new Employee(employeeId3, newName,newSalary);
						litr2.set(e2);
						status1=true;
					}

				}
				if(status1==false) {
					System.out.println("employee details not found");
				}
				else {
					System.out.println("Employee details are updated successfully");
				}
				break;

			case 5:
				boolean status11=false;
				System.out.println("Enter the employee id to delete:");
				int deleteEmployeeId = sc.nextInt();
				Iterator<Employee> itr3=employee.iterator();
				while(itr3.hasNext()) {
					Employee e1=itr3.next();
					if(e1.getEmployeeId()==deleteEmployeeId) {
						itr3.remove(); 
//						System.out.println("Employee with ID " + deleteEmployeeId + " deleted successfully.");
						status11 = true;
					}
				}
				if (status11==false) {
					System.out.println("employee details not found");
				}
				else {
					System.out.println("Employee with ID " + deleteEmployeeId + " deleted successfully.");
				}
				break;
			case 6:
				break;
			}
		}while(choice!=0);
	}
}