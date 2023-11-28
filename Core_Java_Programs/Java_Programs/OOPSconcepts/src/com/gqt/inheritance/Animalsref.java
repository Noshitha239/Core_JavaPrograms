package com.gqt.inheritance;



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
public class Animalsref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d=new Dogs();
		Cat c=new Cat();
		Tigers t=new Tigers();
        Animal1 ref;
        
        ref=d;
        System.out.println("***Dog***");
        ref.barking();
        ref.eat();
        ref.sleep();
        d.bite();
        
        ref=c;
        System.out.println("***Cat***");
        ref.barking();
        ref.eat();
        ref.sleep();
        c.runs();
        
        ref=t;
        System.out.println("***Tiger***");
        ref.barking();
        ref.eat();
        ref.sleep();
        t.chasing();

	}

}
