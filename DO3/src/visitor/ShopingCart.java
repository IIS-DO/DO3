package visitor;

public class ShopingCart {
	
	public static void main(String[] args) {
		TotalVisitor totalVisitor = new TotalVisitor();
		Tomato tomato = new Tomato(10,10);
		CookieBox cookieBox = new CookieBox(200,1);
		
		tomato.accept(totalVisitor);
		System.out.println(totalVisitor.getTotal());
		cookieBox.accept(totalVisitor);
		
		System.out.println(totalVisitor.getTotal());

	}

}
