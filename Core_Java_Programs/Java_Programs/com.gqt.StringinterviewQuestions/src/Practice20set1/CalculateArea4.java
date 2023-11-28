//4) Define a base class "Shape" with a method "calculateArea." Create two 
//subclasses, "Circle" and "Triangle," that inherit from "Shape" and provide 
//their own implementations of "calculateArea." Demonstrate polymorphism 
//by calculating the area of various shapes using an array of "Shape" objects.
package Practice20set1;
class Shape{
	void CalculateArea() {
		System.out.println("the area is:");
	}
}
class Circle extends Shape{
	private double pi=3.147;
	private double r=4;
	@Override
	void CalculateArea() {
		double area=pi*r*r;
		System.out.println("the arear of Circle is"+area);
	}
}
class Triangle extends Shape{
	private double base=4;
	private double height=8;
	@Override
	void CalculateArea() {
		double area=0.5*base*height;
		System.out.println("the arear of Circle is"+area);
	}
}
class Geometry{
	void permit(Shape ref) {
		ref.CalculateArea();
	}
}
public class CalculateArea4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		Circle c=new Circle();
		Triangle t=new Triangle();
		Geometry g=new Geometry();
		System.out.println("circle:");
		g.permit(c);
		System.out.println("Traingle:");
		g.permit(t);
	}
}


