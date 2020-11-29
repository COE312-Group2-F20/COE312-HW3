
public class Look implements Command {

	Context c;

	Look(Context c) {
		this.c = c;
	}

	@Override
	public void execute() {
		if (c.location.equals("Dining Hall")) {
			System.out.print(
					"The Dining Hall is the biggest open area inside Hogwarts. Bellatrix Lestrange is here, get ready to fight!\n");
		}

		if (c.location.equals("Library")) {
			System.out.print(
					"The Library is where students spend a lot of their time. Draco Malfoy is here, get ready to fight!\n");
		}
		if (c.location.equals("Potions Classroom")) {

			System.out.println(
					"Potions is one of the core subjects that first year students are required to study. \nIn the potions class there is Professor Snape who teaches the subject. \nHe does not seem very happy to see you and starts attacking you!\n");

		}
	}

}
