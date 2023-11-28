package com.gqt.oops;
class Plane{
	void takeOff(){
		System.out.println("Plane took off");
	}
	void fly(){
		System.out.println("Plane is flying");
	}
	void land(){
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly(){
		System.out.println("CargoPlane fly at minimum speed");
	}
	void carryGoods(){
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly(){
		System.out.println("PassengerPlane fly at medium speed");
	}
	void carryHumans(){
		System.out.println("PassengerPlane carry passengers");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly(){
		System.out.println("FighterPlane fly at great speed");
	}
	void carryWeapons(){
		System.out.println("FighterPlane carry weapons");
	}
}
public class Diffmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        FighterPlane fp=new FighterPlane();
        System.out.println("CargoPlane");
        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryGoods();
        System.out.println("PassengerPlane");
        pp.takeOff();
        pp.fly();
        pp.land();
        pp.carryHumans();
        System.out.println("FighterPlane");
        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapons();
	}

}
