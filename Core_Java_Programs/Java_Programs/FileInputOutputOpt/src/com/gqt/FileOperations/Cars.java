package com.gqt.FileOperations;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Car1 implements Serializable{
	String name;
	transient String model;
	transient String Color;
	int cost;
	Car1(String name,String model,String Color,int cost){
		this.name=name;
		this.model=model;
		this.Color=Color;
		this.cost=cost;
	}
	String getData(){
		return "name ="+name+"----model ="+model+"----Color ="+Color+"----cost ="+cost;
	}	
}
class Dog1 implements Serializable{
	String name;
	transient String Breed;
	transient String Color;
	int cost;
	Dog1(String name,String Breed,String Color,int cost){
		this.name=name;
		this.Breed=Breed;
		this.Color=Color;
		this.cost=cost;
	}
	String getData(){
		return "name ="+name+"----Breed ="+Breed+"----Color ="+Color+"----cost ="+cost;
	}	
}
public class Cars{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Car1 c= new Car1("Honda","A2","Black",100000);
		System.out.println(c.getData());
		Dog1 d= new Dog1("Rocky","GermanSheperd","Black",10000);
		System.out.println(d.getData());
		String path="C:\\IoPrograms\\Car.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.writeObject(d);
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Car1 c1=(Car1) ois.readObject();
		Dog1 d1=(Dog1) ois.readObject();
		System.out.println(c1.getData());
		System.out.println(d1.getData());
	}
}
