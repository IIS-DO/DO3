package builder;

import java.util.ArrayList;
import java.util.List;

public class SandwichStatic {
	private String bread;
	private List<String> spread;
	private List<String> meat;
	private List<String> salad;
	private List<String> dressing;
	
	public SandwichStatic(Builder builder) {
		this.bread = builder.bread;
		this.spread = builder.spread;
		this.meat = builder.meat;
		this.salad = builder.salad;
		this.dressing = builder.dressing;
	}
	
	public static class Builder{
		private static Builder builder;
		private static String bread;
		private static List<String> spread;
		private static List<String> meat;
		private static List<String> salad;
		private static List<String> dressing;
		
		public Builder() {
			this.bread = bread;
			spread = new ArrayList<String>();
			meat = new ArrayList<String>();
			salad = new ArrayList<String>();
			dressing = new ArrayList<String>();
			
		}
		
		public static Builder spread(String spread) {
			builder.spread.add(spread);
			return builder;
		}
		
		public static Builder meat(String meat) {
			builder.meat.add(meat);
			return builder;
		}
		
		public static Builder salad(String salad) {
			builder.salad.add(salad);
			return builder;
		}
		
		public static Builder dressing(String dressing) {
			builder.dressing.add(dressing);
			return builder;
		}
		
		public static SandwichStatic build() {
			return new SandwichStatic(builder);
		}
		
		
		
	}
	

}
