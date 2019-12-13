package factoryMethod;

public class GasBill extends Bill{

	@Override
	public void calculateTotal() {
		System.out.println("Gas bill is too high...");
		
	}

}
