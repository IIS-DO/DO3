package factoryMethod2;

public class GasBill implements Bill{

	@Override
	public void calculateTotal() {
		System.out.println("Gas bill is too high...");
		
	}

}
