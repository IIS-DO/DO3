package command;

import mvc.Line;

public class CmdLineUpdate implements Command{
	private Line oldState;
	private Line newState;
	private Line original = new Line();
	
	public CmdLineUpdate(Line oldState, Line newState) {
		this.oldState = oldState;
		this.newState = newState;
	}

	@Override
	public void execute() {
		/*original.setStartPoint(oldState.getStartPoint());
		original.setEndPoint(oldState.getEndPoint());
		original.setColor(oldState.getColor());
		
		oldState.setStartPoint(newState.getStartPoint());
		oldState.setEndPoint(newState.getEndPoint());
		oldState.setColor(newState.getColor());*/
		
		original.getStartPoint().setX(oldState.getStartPoint().getX());
		original.getStartPoint().setY(oldState.getStartPoint().getY());
		original.getStartPoint().setColor(oldState.getStartPoint().getColor());
		
		oldState.getStartPoint().setX(newState.getStartPoint().getX());
		oldState.getStartPoint().setY(newState.getStartPoint().getY());
		oldState.getStartPoint().setColor(newState.getStartPoint().getColor());
		
		
	}

	@Override
	public void unexecute() {
		/*oldState.setStartPoint(original.getStartPoint());
		oldState.setEndPoint(original.getEndPoint());
		oldState.setColor(original.getColor());*/
		
		oldState.getStartPoint().setX(original.getStartPoint().getX());
		oldState.getStartPoint().setY(original.getStartPoint().getY());
		oldState.getStartPoint().setColor(original.getStartPoint().getColor());
		
	}
}
