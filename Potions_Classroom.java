
public class Potions_Classroom extends Classroom implements State {
	static String room = "Potions";
	static String character = "Professor Snape";

	Potions_Classroom() {

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
		System.out.println("You have entered the " + room + " Classroom.");

	}

}