import java.util.Scanner;

class Program1{
	void operation1(){
		System.out.println("Entered into op1");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1=sc.nextInt();
		System.out.println("enter num2: ");
		int num2=sc.nextInt();
		int res=num1/num2;
		System.out.println(res);
		System.out.println("Left from op-1");
	}
}
class Program2{
	void operation2()
	{
		System.out.println("Entered into op2");
		Program1 p1=new Program1();
		p1.operation1();
		System.out.println("Left from op2");
	}
}
class Program3{
	void operation3()
	{
		System.out.println("Entered into op3");
		Program2 p2=new Program2();
		p2.operation2();
		System.out.println("Left from op3");
	}
}
public class Exceptionhandingthrows {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Entered main");
			Program3 p3=new Program3();
			p3.operation3();
			System.out.println("Left from main");
		}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			System.out.println("Entered main");
//			Program3 p3=new Program3();
//			p3.operation3();
//			
//		}
//		catch(Exception e) {
//			System.out.println("Exception handled");
//		}
//		System.out.println("Left from main");
}

