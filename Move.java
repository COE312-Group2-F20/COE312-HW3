
public class Move {
	Context ctx;

	Move(Context c) {
		this.ctx = c;
	}

	public void west() {
		ctx.nextState("Library");
		ctx.printStatus();
	}

	public void east() {
		ctx.nextState("Potions Classroom");
		ctx.printStatus();
	}

	public void north() {
		ctx.nextState("Dining Hall");
		ctx.printStatus();
	}

	public void main_hall() {
		ctx.nextState("Main Hall");
	}

	public void MainHall() {
		ctx.previousState();
		ctx.printStatus();
	}
}
