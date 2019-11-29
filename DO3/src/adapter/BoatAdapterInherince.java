package adapter;

public class BoatAdapterInherince extends Boat implements Vehicle{

	@Override
	public void accelerate() {
		rowFaster();
		
	}

}
