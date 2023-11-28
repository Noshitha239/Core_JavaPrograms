
interface calculator{
	void add();
   static void sub() {
	   System.out.println("Hi from sub");
   }
   default void mul() {
	   System.out.println("Hi from mul");
   }
   static void sub1() {
	   System.out.println("Hi from sub1");
   }
   default void mul1() {
	   System.out.println("Hi from mul1");
   }
   int a=10;
}
public class interface2 {
	public static final int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
