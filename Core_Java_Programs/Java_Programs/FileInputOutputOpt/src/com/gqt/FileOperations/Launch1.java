package com.gqt.FileOperations;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
//class Cricketer1 implements Serializable{
//	int Cric_Id;
//	String name;
//	String Country;
//	int runs;
//	Cricketer1(int Cric_id,String name,String country,int runs){
//		this.Cric_Id=Cric_id;
//		this.name=name;
//		this.Country=country;
//		this.runs=runs;
//	}
//	String getData() {
//		return "id ="+Cric_Id+"----name ="+name+"----Country ="+Country+"----runs ="+runs;
//	}	
//}
public class Launch1{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Cricketer c= new Cricketer(1,"Rohit","India",10000);
		System.out.println(c.getData());
		String path="C:\\IoPrograms\\Cricketer.txt";
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cricketer c1=(Cricketer) ois.readObject();
		System.out.println(c1.getData());
	}

}
