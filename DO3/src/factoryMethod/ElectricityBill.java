package factoryMethod;

public class ElectricityBill extends Bill{

	@Override
	public void calculateTotal() {
		System.out.println("Electricity bill is too high...");
		
	}

}
