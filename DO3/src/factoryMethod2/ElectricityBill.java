package factoryMethod2;

public class ElectricityBill implements Bill{

	@Override
	public void calculateTotal() {
		System.out.println("Electricity bill is too high...");
		
	}

}
