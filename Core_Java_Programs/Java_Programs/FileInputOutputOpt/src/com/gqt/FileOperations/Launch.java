package com.gqt.FileOperations;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable{
	int Cric_Id;
	transient String name;
	String Country;
	int runs;
	Cricketer(int Cric_id,String name,String country,int runs){
		this.Cric_Id=Cric_id;
		this.name=name;
		this.Country=country;
		this.runs=runs;
	}
	String getData(){
		return "id ="+Cric_Id+"----name ="+name+"----Country ="+Country+"----runs ="+runs;
	}	
}
class Launch{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Cricketer c= new Cricketer(1,"Rohit","India",10000);
		System.out.println(c.getData());
		String path="C:\\IoPrograms\\Cricketer.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
	}

}
