package builder;

public class Test {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("beli");
		
		builder.meat("pecenica").dressing("majonez").meat("sunka");
		
		Sandwich sandwich = builder.build();
		
		SandwichStatic sandwichStatic = SandwichStatic.Builder.meat("salama").salad("zelena").build();

	}

}
