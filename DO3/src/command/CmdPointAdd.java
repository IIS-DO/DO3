package command;

import mvc.DrawingModel;
import mvc.Point;

public class CmdPointAdd implements Command{
	private DrawingModel model;
	private Point point;
	
	public CmdPointAdd(DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}
	

	@Override
	public void execute() {
		model.add(point);
		
	}

	@Override
	public void unexecute() {
		model.remove(point);
		
	}

}
