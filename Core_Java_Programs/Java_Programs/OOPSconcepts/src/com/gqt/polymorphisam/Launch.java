package com.gqt.polymorphisam;

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

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		PassengerPlane pp = new PassengerPlane();
		Airport a=new Airport();
		System.out.println("****** Cargo Plane ******");
		a.permit(cp);
		cp.carryGoods();
		System.out.println("****** Fighter Plane ******");
		a.permit(fp);
		fp.carryWeapons();
		System.out.println("****** Passenger Plane ******");
		a.permit(pp);
		pp.carryPassenger();
	}
}

