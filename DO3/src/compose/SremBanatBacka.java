package compose;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import mvc.Shape;

public class SremBanatBacka extends Shape{
	
	private List<Shape> children = new ArrayList<Shape>();
	
	public void add(Shape s) {
		children.add(s);
	}
	
	public void remove(Shape s) {
		children.remove(s);
	}
	

	@Override
	public void draw(Graphics g) {
		ListIterator<Shape> it = children.listIterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
	}

}
