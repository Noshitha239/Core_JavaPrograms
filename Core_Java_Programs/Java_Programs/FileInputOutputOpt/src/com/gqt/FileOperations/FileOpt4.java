package com.gqt.FileOperations;
import java.io.File;
import java.io.IOException;
public class FileOpt4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f= new File("C:\\IoPrograms\\test.txt");
        f.createNewFile();
        System.out.println("File created");
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.exists());
        System.out.println(f.getFreeSpace());
        System.out.println(f.getTotalSpace());
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.getUsableSpace());
        System.out.println(f.hashCode());
        System.out.println(f.isAbsolute());
        System.out.println(f.isHidden());
        System.out.println(f.lastModified());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.getClass());
        System.out.println(f.length());
        System.out.println(f.delete());        
	}
}
