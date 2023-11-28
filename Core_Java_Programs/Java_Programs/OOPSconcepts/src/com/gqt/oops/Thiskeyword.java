package com.gqt.oops;
public class Thiskeyword {
    private String name;
    private String color;
    private int age;
    private int cost;
    Thiskeyword(String name, String color,int age, int cost){
    	super();
        this.name=name;
    	this.color=color;
    	this.age=age;
        this.cost=cost;
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
    class MainApp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thiskeyword t=new Thiskeyword("Rocky","White",7,7000);
        System.out.println(t.getName());
        System.out.println(t.getColor());
        System.out.println(t.getAge());
        System.out.println(t.getCost());
	}

}
}
