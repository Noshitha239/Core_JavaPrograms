package Abstraction;
abstract class Shapes{
	double area;
	abstract void collectData();
	abstract void calculate();
	void display(){
		System.out.println(area);
	}
}
class circle extends Shapes{
	private double r;
	final double pi=3.147;
	void setR(double r) {
		this.r=pi*r*r;
	}
	void collectData(){
		System.out.println("Circle Data collected");
	}
	void calculate(){
		area=r;
		System.out.println("Circle area Calculated");
	}
}
class Square extends Shapes{
	private double side;
	void setSide(double side) {
		this.side=side;
	}
	void collectData() {
		System.out.println("Square Data collected");
	}
	void calculate() {
		area=side*side;
		System.out.println("Square area Calculated");
	}
}
class Rectangle extends Shapes{
	private double l;
	private double b;
	void setL(double l) {
		this.l=l;
	}
	void setB(double b) {
		this.b=b;
	}
	void collectData() {
		System.out.println("Rectangle Data collected");
	}
	void calculate() {
		area=l*b;
		System.out.println("Rectangle area Calculated");
	}
}
class Geometry{
	void permit(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
public class MultipleOOps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		Square s1=new Square();
		Rectangle r=new Rectangle();
		c.setR(3.3);
		s1.setSide(4);
		r.setB(5);
		r.setL(8);
//		c.collectData();
//		s1.collectData();
//		r.collectData();
//		c.calculate();
//		s1.calculate();
//		r.calculate();
//		c.display();
//		s1.display();
//		r.display();
		Geometry g=new Geometry();
		g.permit(c);
		g.permit(s1);
		g.permit(r);
	}
}



