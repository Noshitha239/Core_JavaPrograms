import java.util.Scanner;
class Program12{
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
class Program22{
	void operation2()
	{
		System.out.println("Entered into op2");
		Program12 p12=new Program12();
		p12.operation1();
		System.out.println("Left from op2");
	}
}
class Program33{
	void operation3()
	{
		System.out.println("Entered into op3");
		Program22 p22=new Program22();
		p22.operation2();
		System.out.println("Left from op3");
	}
}
class Program44{
	void operation4() {
		try {
			System.out.println("Entered into op4");
			Program33 p33=new Program33();
			p33.operation3();	
			}
			catch(Exception e) {
				System.out.println("Exception handled in operation4");
				throw e;
			}
		finally {
			System.out.println("Left from op4");
		}	
	}
}
public class ExceptionTrowskeyword{
	public static void main(String[] args){
		//TODO Auto-generated method stub
		try {
		System.out.println("Entered main");
		Program44 p44=new Program44();
		p44.operation4();	
		}
		catch(Exception e) {
			System.out.println("Exception handled in main");
		}
		System.out.println("Left from main");
}
}

