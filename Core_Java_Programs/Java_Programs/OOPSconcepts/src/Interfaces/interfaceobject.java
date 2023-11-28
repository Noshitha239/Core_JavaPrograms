
interface Calculator{
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
public class interfaceobject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator c= new Calculator() {
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
        Calculator.sub();
        c.mul();
	}
}
