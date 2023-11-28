package com.gqt.FileOperations;
import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Dog implements Serializable{
	String name;
	transient String Breed;
	transient String Color;
	int cost;
	Dog(String name,String Breed,String Color,int cost){
		this.name=name;
		this.Breed=Breed;
		this.Color=Color;
		this.cost=cost;
	}
	String getData() {
		return "name ="+name+"----Breed ="+Breed+"----Color ="+Color+"----cost ="+cost;
	}	
}
public class dogs {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dog d= new Dog("Rocky","GermanSheperd","Black",10000);
		System.out.println(d.getData());
		String path="C:\\IoPrograms\\Dog.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog) ois.readObject();
		System.out.println(d1.getData());
	}

}
