package command;

import mvc.Point;

public class CmdPointUpdate implements Command{
	private Point oldState;
	private Point newState;
	private Point original = new Point();
	
	CmdPointUpdate(Point oldState, Point newState){
		this.oldState = oldState;
		this.newState = newState;
	}
	

	@Override
	public void execute() {
		original.setX(oldState.getX());
		original.setY(oldState.getY());
		original.setColor(oldState.getColor());
		
		oldState.setX(newState.getX());
		oldState.setY(newState.getY());
		oldState.setColor(newState.getColor());
		
		System.out.println("metoda, oldState -> " + oldState);
		
	}

	@Override
	public void unexecute() {
		oldState.setX(original.getX());
		oldState.setY(original.getY());
		oldState.setColor(original.getColor());
		
	}

}
