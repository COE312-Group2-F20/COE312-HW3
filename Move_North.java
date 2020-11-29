
public class Move_North implements Command {
	Move move;

	Move_North(Move m) {
		this.move = m;
	}

	public void execute() {
		move.north();
	}

}
