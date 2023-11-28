//6) Develop a banking system with a base class "Account" and subclasses 
//"SavingsAccount" and "CheckingAccount." Each account type should have a 
//method "calculateInterest" that calculates interest differently. 
//Demonstrate polymorphism by calling the "calculateInterest" method on 
//both account types.
package Practice20set1;
class Acount{
	double intrest;
	double p;
	double r;
	double n;
	void setData(double intrest,double p,double r,double n) {
		this.intrest=intrest;
		this.p=p;
		this.r=r;
		this.n=n;
	}
	void calculateInterest() {
		System.out.println("calculate the interset");
	}
}
class SavingsAccount extends Acount{
	@Override
	void calculateInterest() {
		intrest=p*r*n;
		System.out.println("Intrest for Savings Account is:"+intrest);
	}
}
class CheckingAccount extends Acount{
	double interestRate = 0.01; // 1% interest rate for checking account
	@Override
	void calculateInterest() {
		double interest = p * r*interestRate;
		System.out.println("Interest calculated and added: $" + interest);

	}
}
public class SavingsAccount6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s=new SavingsAccount();
		CheckingAccount c=new CheckingAccount();
		s.setData(0.2,200.3, 1000, 30);
		c.setData(500, 230, 10, 0);
		s.calculateInterest();
		c.calculateInterest();
	}
}
