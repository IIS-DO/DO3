package mvc;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	private Color color;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint, Color color) {

		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + ", color=" + color + "]";
	}
}
