package Interfaces;
interface Calculator1{
	void add();
	static void sub() {
		System.out.println("Hi from sub");
	}
	default void mul(){
		System.out.println("Hi from mul");
	}
	int a=10;
	void add1();
}

public class Interfaceobj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Interfaces.Calculator1 c= new Interfaces.Calculator1() {
        	@Override
        	public void add() {
        		System.out.println("From main");
        	}

			@Override
			public void add1() {
				// TODO Auto-generated method stub
				
			}
        };
        c.add();
        Calculator1.sub();
        c.mul();
	}
}
