//10) Define a class "Animal" with properties like name, age, and sound. Create 
//two subclasses, "Dog" and "Cat," that inherit from the "Animal" class. Add 
//methods to both subclasses to make them produce their respective 
//sounds. Demonstrate polymorphism by creating instances of each subclass 
//and calling the sound methods. (Inheritance)
package Practice20set1;
class Animal1{
	String name;
	int age;
	String sound;
	public void makeSound() {
		System.out.println(name + " makes a sound: " + sound);
	}
}
class Dog extends Animal1{
	Dog(String name,int age,String sound){
		super();
		this.name=name;
		this.age=age;
		this.sound="wolf";

	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getSound() {
		return sound;
	}
}
class Cat extends Animal1{
	Cat(String name,int age,String sound){
		super();
		this.name=name;
		this.age=age;
		this.sound="Meow!";
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getSound() {
		return sound;
	}

}
public class Animal10 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Dog d=new Dog("rocky",4,"wolf");
		Cat c=new Cat("ram",5,"Meow!");
		System.out.println("Dog Properties:");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println("Dog makes sound like:"+d.getSound());
		System.out.println("Cat Properties:");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println("cat makes sound like:"+c.getSound());
	}

}
