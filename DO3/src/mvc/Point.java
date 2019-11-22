package mvc;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{
	private int x;
	private int y;
	private Color color;
	
	public Point() {
		
	}
	
	public Point(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x-1, y-1, x+1, y+1);
		g.drawLine(x-1, y+1, x+1, y-1);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", color=" + color + "]";
	}
	
	
	
	

}
