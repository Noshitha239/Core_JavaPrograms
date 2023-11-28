package com.gqt.oops;
public class Student {
	 private String name;
	   private int Rollno;
	   private int age;
	   private String email;
	
	public Student(String name, int rollno, int age, String email) {
		super();
		this.name = name;
		this.Rollno = rollno;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public int getRollno() {
		return Rollno;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}

class MainApp{
public static void main(String[] args) {
	// TODO Auto-generated method stub
    Student s=new Student("Noshi", 518, 20, "Vnoshitha@gmail.com");
    System.out.println(s.getName());
	System.out.println(s.getRollno());
	System.out.println(s.getAge());
	System.out.println(s.getEmail());
	
}	
}
}
