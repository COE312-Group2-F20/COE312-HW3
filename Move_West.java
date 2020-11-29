
public class Move_West implements Command {

	Move move;

	Move_West(Move m) {
		this.move = m;
	}

	public void execute() {
		move.west();
	}

}
