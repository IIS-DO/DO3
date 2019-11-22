package command;

import mvc.DrawingModel;
import mvc.Line;

public class CmdLineAdd implements Command{
	private DrawingModel model;
	private Line line;
	
	public CmdLineAdd(DrawingModel model, Line line) {
		this.model = model;
		this.line = line;
	}

	@Override
	public void execute() {
		model.add(line);
	}

	@Override
	public void unexecute() {
		model.remove(line);
		
	}
}
