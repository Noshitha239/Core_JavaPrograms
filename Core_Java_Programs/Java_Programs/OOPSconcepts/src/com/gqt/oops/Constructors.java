package com.gqt.oops;
import java.util.*;
class Dog extends Object{
	private String name;
	private String color;
	private int age;
	private int cost;
	
	Dog(){
		super();
		name="Noshi";
		color="Black";
		age=12;
		cost=5000;
	}
	Dog(String a){
		super();
		name=a;
	}
	Dog(String a,String b){
		super();
		name=a;
		color=b;
	}
	Dog(String a,String b,int d){
		super();
		name=a;
		color=b;
		cost=d;
	}
	Dog(String a,String b,int c,int d){
		super();
		name=a;
		color=b;
		age=c;
		cost=d;
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
	int getCost() {
		return cost;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
	}
	
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d1=new Dog();
        d1.getData();
        Dog d2=new Dog("Rocky");
        d2.getData();
        Dog d3=new Dog("Rocky","White");
        d3.getData();
        Dog d4=new Dog("Rocky","White",7000);
        d4.getData();
        Dog d5=new Dog("Rocky","White",7,7000);
        d5.getData();
        
	}

}
