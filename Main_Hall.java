
public class Main_Hall implements State {

	public void prev(Context context) {
		System.out.println("The Entrence.");
	}

	@Override
	public void next(Context context) {
		if (context.location.equals("Dining Hall")) {
			context.setState(new Dining_Hall());
		}
		if (context.location.equals("Potions Classroom")) {
			context.setState(new Potions_Classroom());
		}
		if (context.location.equals("Library")) {
			context.setState(new Library());
		}
	}

	@Override
	public void printStatus() {
		System.out.println(
				"You arrive at the doors of Hogwarts. The door on the north wall leads to the dining hall, the door to the east leads to the Potions class, and the door to the west leads to the Library.");

	}

}
