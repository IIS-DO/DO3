package mvc;

import java.awt.Graphics;
import java.util.ListIterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel{
	private DrawingModel model = new DrawingModel(); //zbog Window Builder-a

	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
	public void paint(Graphics g) {
		ListIterator<Point> it = model.getShapes().listIterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
		//repaint();
		//System.out.println(System.currentTimeMillis());
	}
	
	

}
