import java.util.*;

class InvalidCustomerException extends Exception{
	public String getMessage() {
		return "Invalid credential, Please try again!!!";
	}
}
class customer{
	int original_accno=1234;
	int original_pin=2479;
	int accno;
	int pin;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		accno=sc.nextInt();
		System.out.println("Enter the Pin: ");
		pin =sc.nextInt();
	}
	void verify() throws InvalidCustomerException{
		if(original_accno==accno) {
			if(original_pin==pin) {
				System.out.println("Access Granted");
			}else {
				InvalidCustomerException ice=new InvalidCustomerException();
				System.out.println(ice.getMessage());
				throw ice;
			}
		}
		else {
			InvalidCustomerException ice=new InvalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}
class ATM{
	void permit(customer c) {
		try {
			c.collectData();
			c.verify();
		}
		catch(InvalidCustomerException e1) {
			try {
				c.collectData();
				c.verify();

			}
			catch(InvalidCustomerException e2) {
				try {
					c.collectData();
					c.verify();
				}
				catch(InvalidCustomerException e3) {
					System.out.println("Card Blocked");
					System.exit(0);
				}
			}
		}
	}
	public class Bank1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			customer c1=new customer();
			ATM a1=new ATM();
			a1.permit(c1);
		}

	}
}
