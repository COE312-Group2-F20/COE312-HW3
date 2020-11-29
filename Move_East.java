
public class Move_East implements Command {

	Move move;

	Move_East(Move m) {
		this.move = m;
	}

	@Override
	public void execute() {
		move.east();
	}

}
