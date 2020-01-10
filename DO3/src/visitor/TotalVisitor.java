package visitor;

public class TotalVisitor implements Visitor{
	private double total;
	
	public double getTotal() {
		return total;
	}
	

	@Override
	public void visit(Tomato tomato) {
		total = total + tomato.getPrice()*tomato.getWeight();
		
	}

	@Override
	public void visit(CookieBox cookieBox) {
		total = total + cookieBox.getPrice()*cookieBox.getQuantity();
		
	}

}
