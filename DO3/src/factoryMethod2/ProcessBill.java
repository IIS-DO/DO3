package factoryMethod2;

public abstract class ProcessBill {
	protected Bill bill;
	
	public void storeBill(String type) {
		createBill(type);
		//...
		bill.calculateTotal();
	}
	
	public abstract void createBill(String type);
}
