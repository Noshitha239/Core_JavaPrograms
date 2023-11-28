package com.gqt.FileOperations;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileOpt3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String p1="C:\\IoPrograms\\input.txt";
		String p2="C:\\IoPrograms\\output2.txt";
		FileReader fr= new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		int temp;
		FileWriter fw= new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		while((temp=fr.read())!=-1) {
			bw.write(temp);
		   
		}
		bw.flush();
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}

}
