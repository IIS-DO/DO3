package prototype;

import java.awt.Color;


import mvc.Point;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.RED);
		
		LineShallow lin1 = new LineShallow(p1, p2, Color.RED);
		
		LineShallow lin2 = lin1.clone();
		
		System.out.println(lin1.hashCode());
		System.out.println(lin2.hashCode());
		
		System.out.println(lin1.getStartPoint());
		System.out.println(lin2.getStartPoint());
		
		System.out.println(lin1.getStartPoint().hashCode());
		System.out.println(lin2.getStartPoint().hashCode());
		
		lin1.getStartPoint().setX(30);
		
		System.out.println(lin2.getStartPoint().getX());
		
		System.out.println("DEEP");
		
		Point p3 = new Point(10, 10, Color.RED);
		Point p4 = new Point(20, 20, Color.RED);
		
		LineDeep lin3 = new LineDeep(p3, p4, Color.RED);
		
		LineDeep lin4 = lin3.clone();
		
		System.out.println(lin3.hashCode());
		System.out.println(lin4.hashCode());
		
		System.out.println(lin3.getStartPoint());
		System.out.println(lin4.getStartPoint());
		
		System.out.println(lin3.getStartPoint().hashCode());
		System.out.println(lin4.getStartPoint().hashCode());
		
		lin3.getStartPoint().setX(30);
		
		System.out.println(lin4.getStartPoint().getX());

	}

}
