//13) Create a Java class to represent a "Book" with private fields for title, 
//author, and price. Provide encapsulated methods to get and set these 
//fields. Write a sample program to demonstrate its usage.
package Practice20set1;
class Book{
	private String Title;
	private String Author;
	private int Price;
	void setData(String a,String b, int c) {
		Title=a;
		Author=b;
		Price=c;
	}
	void getData() {
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(Price);
	}
}
public class Book13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setData("Rich Man","Ramya",4000);
		b.getData();
	}
}
