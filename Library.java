public class Library extends Classroom implements State {

	static String room = "Library";
	static String character = "Draco Malfoy";

	Library() {
		super(room, character);

	}

	@Override
	public void prev(Context context) {
		context.setState(new Main_Hall());

	}

	@Override
	public void next(Context context) {
		context.setState(new Main_Hall());

	}

	@Override
	public void printStatus() {
		System.out.println("You have entered the " + room + ".");
	}

}