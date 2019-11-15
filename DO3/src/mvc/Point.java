package mvc;

import java.awt.Color;
import java.awt.Graphics;

public class Point {
	private int x;
	private int y;
	private Color color;
	
	public Point(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x-1, y-1, x+1, y+1);
		g.drawLine(x-1, y+1, x+1, y-1);
	}
	
	

}
