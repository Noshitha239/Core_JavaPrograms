package com.gqt.oops;

class Cricketer{
	 private String name;
		    private String color;
		    private int age;
		    private int tnumber;
		    Cricketer(){
		    	super();
//		    	 System.out.println(name);
//			        System.out.println(color);
//			        System.out.println(age);
//			        System.out.println(tnumber);
		        this.name="Sachin";
		    	this.color="White";
		    	this.age=60;
		        this.tnumber=4;
//		        System.out.println(name);
//		        System.out.println(color);
//		        System.out.println(age);
//		        System.out.println(tnumber);
		    }
		    Cricketer(String name){
		    	this();
		    	this.name=name;
//		    	 System.out.println(name);
//			        System.out.println(color);
//			        System.out.println(age);
//			        System.out.println(tnumber);
		    }
		    Cricketer(String name, String color){
		    	this("Rahul");
		    	this.name=name;
		    	this.color=color;
//		    	 System.out.println(name);
//			        System.out.println(color);
//			        System.out.println(age);
//			        System.out.println(tnumber);
		    }
		    Cricketer(String name, String color,int age){
		    	this("Virat","Brown");
		    	this.name=name;
		    	this.color=color;
		    	this.age=age;
//		    	 System.out.println(name);
//			        System.out.println(color);
//			        System.out.println(age);
//			        System.out.println(tnumber);
		    }
		    Cricketer(String name, String color, int age,int tnumber){
		    	this("Dhoni","Black",30);
		    	this.name=name;
		    	this.color=color;
		    	this.age=age;
		    	this.tnumber=tnumber;
//		    	 System.out.println(name);
//			        System.out.println(color);
//			        System.out.println(age);
//			        System.out.println(tnumber);
		    }
		    String getName() {
		    	return name;
		    }
		    String getColor() {
		    	return color;
		    }
		    int getAge() {
		    	return age;
		    }
		    int getTnumber() {
		    	return tnumber;
		    }
	}
public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer t=new Cricketer("Rohit","Grey",70,8);
		  System.out.println(t.getName());
		  System.out.println(t.getColor());
		  System.out.println(t.getAge());
		  System.out.println(t.getTnumber());
	}

}
