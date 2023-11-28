import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ierator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);
		al.add(300);
		System.out.println(al);
		System.out.println("------------------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("------------------------");
        for (Object object : al) {
			System.out.println(object);
		}
        System.out.println("------------------------");
        int i=0;
        while(i<al.size()) {
        	System.out.println(al.get(i));
        	i++;
        }
        System.out.println("------------------------");
        int j=0;
        do {
        	System.out.println(al.get(j));
        	j++;
        }
        while(j<al.size());
        System.out.println("------------------------");
        Iterator iterator=al.iterator();
        while(iterator.hasNext()==true) {
        	System.out.println(iterator.next());
        }
        System.out.println("------------------------");
        ListIterator ListIterator=al.listIterator();
        while(ListIterator.hasNext()==true) {
        	System.out.println(ListIterator.next());
        }
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Specified index is not found");
			
		}
	}
}
