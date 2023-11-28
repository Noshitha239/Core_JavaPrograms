package Abstraction;
abstract class Plane{
	void takeOff() {
		System.out.println("Plane is takeOff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane is landed");
	}
}
class cargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlane fly slow");
	}
}
class passengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium");
	}
}
class fighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at top");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //Plane p=new Plane();//error con't instantiate the class plane
           cargoPlane cp=new cargoPlane();
           passengerPlane pp=new passengerPlane();
           fighterPlane fp=new fighterPlane();
           Airport a= new Airport();
           a.permit(cp);
           a.permit(pp);
           a.permit(fp);
           
           
	}

}
