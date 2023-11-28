/**
 * 
 */
package com.gqt.oops;

/**
 * @author 91817
 *
 */
class T {

	/**
	 * @param args
	 */
	 private String name;
	    private String color;
	    private int age;
	    private int cost;
	    T(){
	    	super();
	        this.name="Tommy";
	    	this.color="Black";
	    	this.age=7;
	        this.cost=4500;
	    }
	    T(String name){
	    	this();
	    	this.name=name;
	    }
	    T(String name, String color){
	    	this("Ramu");
	    	this.name=name;
	    	this.color=color;
	    }
	    T(String name, String color,int age){
	    	this("Rocky","White");
	    	this.name=name;
	    	this.color=color;
	    	this.age=age;
	    }
	    T(String name, String color, int age,int cost){
	    	this("Jipcy","Brown");
	    	this.name=name;
	    	this.color=color;
	    	this.cost=cost;
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
	    int getCost() {
	    	return cost;
	    }
    }
    public class Thismethod{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        T t=new T("Jockey","Grey",7,8000);
        System.out.println(t.getName());
        System.out.println(t.getColor());
        System.out.println(t.getCost());
        System.out.println(t.getAge());
	}

}

