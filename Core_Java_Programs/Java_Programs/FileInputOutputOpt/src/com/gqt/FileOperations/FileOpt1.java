package com.gqt.FileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOpt1 {
      public static void main(String[] args) throws IOException {
		String p1="C:\\IoPrograms\\input.txt";
		String p2="C:\\IoPrograms\\output.txt";
		FileInputStream fis = new FileInputStream(p1);
		int temp;
		FileOutputStream fos = new FileOutputStream(p2);
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		//fos.close();
		//fis.close();
	}
}
