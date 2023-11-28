//16) Design a class called "Person" with private fields for name, age, and 
//gender. Ensure encapsulation and provide a method to check if a person is 
//eligible to vote (age >= 18). Write a program to test this class.
package Practice20set1;
class Person{
	private String name;
	private int age;
	private String gender;
	 Person(){
		 name="ramya";
		 age=22;
		 gender="female";
	 }
	 void getData() {
		 System.out.println("The name of the Person is:"+name);
		 System.out.println("The of "+ name + " is:"+age);
		 System.out.println("The gender "+ name + " is:"+gender);
	 }
	 public void Check() {
		 if(age>=18) {
			 System.out.println("The Person Elgible to vote");
		 }
		 else {
			 System.out.println("The person is not Elgible to vote");
		 }
	 }
}

public class Vote16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.getData();
		p.Check();
		
	}

}
