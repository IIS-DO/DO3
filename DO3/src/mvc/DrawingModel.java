package mvc;

import java.util.ArrayList;
import java.util.List;

public class DrawingModel {
	
	private List<Point> shapes = new ArrayList<Point>();

	public List<Point> getShapes() {
		return shapes;
	}
	
	public void add(Point p) {
		shapes.add(p);
	}
	
	public void remove(Point p) {
		shapes.remove(p);
	}
	
	public Point get(int i) {
		return shapes.get(i);
	}
	
	

}
