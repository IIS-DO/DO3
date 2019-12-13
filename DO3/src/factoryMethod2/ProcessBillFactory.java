package factoryMethod2;


public class ProcessBillFactory extends ProcessBill{

	@Override
	public void createBill(String type) {
		if(type.equals("electricity")) {
			bill = new ElectricityBill();
		} else if (type.equals("gas")) {
			bill = new GasBill();
		} else {
			bill = null;
		}
		
	}

}
