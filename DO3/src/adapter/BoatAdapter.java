package adapter;

public class BoatAdapter implements Vehicle{
	private Boat boat;
	
	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void accelerate() {
		boat.rowFaster();
		
	}

}
