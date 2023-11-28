package com.gqt.inheritance;
class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plan landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane fly at low heights");
	}
	void carryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium heights");
	}
	void carryPassenger() {
		System.out.println("Passenger plane carry passengers");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at great heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
}
public class Launch {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();
		Plane ref;
		
		ref = cp;
		System.out.println("****** Cargo Plane ******");
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		
		ref=fp;
		System.out.println("****** Fighter Plane ******");
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
		
		ref=pp;
		System.out.println("****** Passenger Plane ******");
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryPassenger();
		
	}
}












