package com.gqt.oops;

public class Dog1 {
   private String name;
   private String color;
   private int age;
   private int cost;
public Dog1(String name, String color, int age, int cost) {
	super();
	this.name = name;
	this.color = color;
	this.age = age;
	this.cost = cost;
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public int getAge() {
	return age;
}
public int getCost() {
	return cost;
} 
}
class MainApp{
	public static void main(String[] args) {
		Dog1 t=new Dog1("Rocky","White", 7, 7000);
		System.out.println(t.getName());
        System.out.println(t.getColor());
        System.out.println(t.getAge());
        System.out.println(t.getCost());
	}
}