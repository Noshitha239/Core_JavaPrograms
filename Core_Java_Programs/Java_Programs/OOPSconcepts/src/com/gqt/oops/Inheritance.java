package com.gqt.oops;
class Animal{
	String name;
	String color;
	int age;
	Animal(){
		super();
		name="Rocky";
		color="White";
		age=7;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
}
class Tiger extends Animal{
	Tiger(String name, String color, int age){
		super();
		this.name=name;
		this.color=color;
		this.age=age;
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
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Tiger t=new Tiger("Ramu","Orange",5);
        System.out.println(t.getName());
        System.out.println(t.getColor());
        System.out.println(t.getAge());
	}

}
