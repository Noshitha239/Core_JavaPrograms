//Program to identify and print all repeated characters of a string?
package com.gqt.StringAssignments;
import java.util.Scanner;
public class RepeatedChar{
	public static void main(String[] args){
		// TODO Auto-generated method stub  
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a String: ");
	        String s1= sc.next();
	        char str[]=s1.toCharArray();
	        int l[]=new int[s1.length()];
			for(int i=0;i<s1.length();i++){
				l[i]=1;
				for(int j=i+1;j<s1.length();j++){
					if(str[i]==str[j]) {
						l[i]++;
						str[j]=0;
					}
				}
			}
			/*for(int i=0;i<l.length;i++){
				if(str[i]==' '||str[i]==0){	
				}
				else{
					System.out.println(str[i]+"---"+l[i]);
				}
			}*/
			for(int i=0;i<l.length;i++) {
			if(l[i]>1){
				System.out.println(str[i]);
			}
			}
	}
}

