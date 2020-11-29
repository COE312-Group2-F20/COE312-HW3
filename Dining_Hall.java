
public class Dining_Hall extends Classroom implements State {
	static String room = "Dining Hall";
	static String character = "Bellatrix Lestrange";

	Dining_Hall() {
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