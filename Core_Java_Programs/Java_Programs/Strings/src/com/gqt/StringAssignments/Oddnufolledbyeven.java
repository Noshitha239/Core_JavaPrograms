package com.gqt.StringAssignments;
import java.util.Scanner;
public class Oddnufolledbyeven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s1=sc.next();
		String temp="";
		String temp1="";
		for(int i=0;i<s1.length();i++){
			if(i%2==0){
				temp=temp+s1.charAt(i);
			}
			else if(i%2!=0){
				temp1=temp1+s1.charAt(i);
			}
		}
		System.out.println(temp1+temp);
		}
	}

