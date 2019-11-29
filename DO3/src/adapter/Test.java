package adapter;

public class Test {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle ship = new Ship();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		
		car.accelerate();
		plane.accelerate();
		ship.accelerate();
		boatAdapter.accelerate();
		

	}

}
