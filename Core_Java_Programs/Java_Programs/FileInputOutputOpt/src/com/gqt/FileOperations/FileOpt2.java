package com.gqt.FileOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOpt2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String p1="C:\\IoPrograms\\input.txt";
		String p2="C:\\IoPrograms\\output1.txt";
		FileReader fr= new FileReader(p1);
		int temp;
		FileWriter fw= new FileWriter(p2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();
		
	}

}
