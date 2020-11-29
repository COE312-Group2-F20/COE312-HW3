
public class Move_Main_Hall implements Command {

	Move move;

	Move_Main_Hall(Move m) {
		this.move = m;
	}

	@Override
	public void execute() {
		move.main_hall();
	}

}
