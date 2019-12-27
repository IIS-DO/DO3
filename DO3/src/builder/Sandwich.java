package builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private String bread;
	private List<String> spread;
	private List<String> meat;
	private List<String> salad;
	private List<String> dressing;
	
	public Sandwich(Builder builder) {
		this.bread = builder.bread;
		this.spread = builder.spread;
		this.meat = builder.meat;
		this.salad = builder.salad;
		this.dressing = builder.dressing;
	}
	
	public static class Builder{
		private String bread;
		private List<String> spread;
		private List<String> meat;
		private List<String> salad;
		private List<String> dressing;
		
		public Builder(String bread) {
			this.bread = bread;
			spread = new ArrayList<String>();
			meat = new ArrayList<String>();
			salad = new ArrayList<String>();
			dressing = new ArrayList<String>();
			
		}
		
		public Builder spread(String spread) {
			this.spread.add(spread);
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat.add(meat);
			return this;
		}
		
		public Builder salad(String salad) {
			this.salad.add(salad);
			return this;
		}
		
		public Builder dressing(String dressing) {
			this.dressing.add(dressing);
			return this;
		}
		
		public Sandwich build() {
			return new Sandwich(this);
		}
		
		
		
	}
	

}
