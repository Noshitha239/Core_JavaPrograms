package com.gqt.java.CollectionCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collectioncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(100);
        al.add(100);
        al.add(200);
        al.add(25);
        al.add(300);
        al.add(250);
        System.out.println(al);
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        System.out.println(Collections.frequency(al,100));
        Collections.sort(al);
        System.out.println(Collections.binarySearch(al, 100));
        System.out.println(Collections.replaceAll(al,100, 30));
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        System.out.println( Collections.singletonList(al));
        al.add("Noshitha");
        System.out.println(al);
//        System.out.println(Collections.);
//        

        
        
	}

}
