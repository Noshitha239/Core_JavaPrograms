package com.gqt.oops;
class Animal1{
	void barking(){
		System.out.println("Animals are barking");
	}
	void eat(){
		System.out.println("Animals eat food");
	}
	void sleep(){
		System.out.println("Animals sleep");
	}
}
class Dogs extends Animal1{
	@Override
	void barking(){
		System.out.println("Dog is barking");
	}
	void bite(){
		System.out.println("Dog bite if it seen unknown person");
	}
}
class Cat extends Animal1{
	@Override
	void barking(){
		System.out.println("Cat is bark like meow");
	}
	void runs(){
		System.out.println("Cat runs if it seen rat");
	}
}
class Tigers extends Animal1{
	@Override
	void barking(){
		System.out.println("tiger bark loudly");
	}
	void chasing(){
		System.out.println("tiger chasing deer");
	}
}
public class Animals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d=new Dogs();
		Cat c=new Cat();
		Tigers t=new Tigers();
       
        System.out.println("Dog");
        d.barking();
        d.eat();
        d.sleep();
        d.bite();
        System.out.println("Cat");
        c.barking();
        c.eat();
        c.sleep();
        c.runs();
        System.out.println("Tiger");
        t.barking();
        t.eat();
        t.sleep();
        t.chasing();

	}

}
