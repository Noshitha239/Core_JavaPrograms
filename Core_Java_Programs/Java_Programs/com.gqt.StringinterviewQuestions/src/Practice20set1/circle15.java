//15) Create a "Circle" class with a private field for radius. Implement 
//encapsulated methods to set and get the radius and calculate the area of 
//the circle. Write a program to calculate the area of a circle using this class.
package Practice20set1;
class Circle2{
	private double radius;
	Circle2(){
		radius=5.5;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double getRadius() {
		return radius;
	}
	public  void area() {
		double pi=3.147;
		double area=pi*radius*radius;
		System.out.println(area);
	}
}
public class circle15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Circle2 c=new Circle2();
		   c.setRadius(4.6);
		   c.getRadius();
		   System.out.println("area of circle is:");
		   c.area();
	}

}
