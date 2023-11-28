class Dog{
	String name;
	String color;
	int cost;
	String breed;
void run() {
	System.out.println("Dog runs");
}
void eat() {
	System.out.println("Dog Eats");
}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		Dog d2= new Dog();
		d1.name="Rocky";
		d1.color="Black";
		d1.cost=7000;
		d1.breed="GR";
		d2.name="Tommy";
		d2.color="Brown";
		d2.cost= 5000;
		d2.breed="German Shepherd";
		d1.run();
		d1.eat();
		d2.run();
		d2.eat();
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		System.out.println(d2.name);
		System.out.println(d2.color);
		System.out.println(d2.cost);
		System.out.println(d2.breed);

	}

}
