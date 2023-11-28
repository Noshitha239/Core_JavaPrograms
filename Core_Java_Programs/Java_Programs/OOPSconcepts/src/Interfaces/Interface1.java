package Interfaces;
interface calculator{
	void add();
   static void sub(){
	   System.out.println("Hi from sub");
   }
   default void mul(){
	   System.out.println("Hi from mul");
   }
}
public class Interface1{
	public static final int a=10;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        System.out.println(a);
        calculator.sub();
	}

}
