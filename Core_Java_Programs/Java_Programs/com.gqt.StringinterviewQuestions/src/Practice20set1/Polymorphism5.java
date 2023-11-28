//5) Implement a class hierarchy for a zoo simulation. Create a base class 
//"Animal" with a method "makeSound." Then, create subclasses for 
//different animals like "Lion," "Elephant," and "Monkey" that override the 
//"makeSound" method to produce their specific sounds. Use polymorphism 
//to make animals in the zoo make their sounds.
package Practice20set1;
class Animal{
	void makeSound() {
		System.out.println("animals make sound loudly");
	}
}
class Dogs extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dogs makes sound like BowBow");
	}
}
class Cats extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cats makes sound like Meow");
	}
}
class sounds{
	void permit(Animal ref) {
		ref.makeSound();
	}
}
public class Polymorphism5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs l=new Dogs();
		Cats m=new Cats();
		sounds s=new sounds();
		System.out.println("Dogs");
		s.permit(l);
		System.out.println("Cats");
		s.permit(m);
	}
}
