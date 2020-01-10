package visitor;

public class CookieBox implements Visitable{
	private double price;
	private double quantity;
	
	public CookieBox(double price, double quantity) {
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
