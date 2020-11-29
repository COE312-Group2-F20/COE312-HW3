
public class Spell {

	Context ctx;

	Spell(Context c) {
		this.ctx = c;
	}

	public void expelliarmus() {
		if (ctx.location.equals("Dining Hall")) {
			System.out
					.println("You defeated Bellatrix Lastrange! The door on the east leads to the Potions Classroom.");
		} else if (ctx.location.equals("Potions Classroom")) {
			System.out.println(
					"You defeated Professor Snape! \nNow you can now use the cauldron and ingredients to make the Polyjuice potion or the invisibility potion to proceed without anyone recognizing you...\n¿½The door on the west leads to the Library");
		} else if (ctx.location.equals("Library")) {
			System.out
					.println("You defeated Draco Malfoy! You can look for Hermione now and use two potions to leave.");
		}

	}

	public void stupefy() {
		if (ctx.location.equals("Dining Hall")) {
			System.out.println(
					"You stunned your Bellatrix Lastrange! The door on the east leads to the Potions Classroom.");
		} else if (ctx.location.equals("Potions Classroom")) {
			System.out.println(
					"You stunned Professor Snape! \nNow you can now use the cauldron and ingredients to make the Polyjuice potion or the invisibility potion to proceed without anyone recognizing you...\nThThe door on the west leads to the Library");
		} else if (ctx.location.equals("Library")) {
			System.out.println("You stunned Draco Malfoy! You can look for Hermione now and use two potions to leave.");
		}
	}

	public void protego() {
		System.out.println("You saved yourself!");
		if (ctx.location.equals("Dining Hall")) {
			System.out.println("The door on the east leads to the Potions Classroom.");
		} else if (ctx.location.equals("Potions Classroom")) {
			System.out.println(
					"Now you can now use the cauldron and ingredients to make the Polyjuice potion or the invisibility potion to proceed without anyone recognizing you...\nThehe door on the west leads to the Library");
		} else if (ctx.location.equals("Library")) {
			System.out.println("You can look for Hermione now and use two potions to leave.");
		}
	}

	public void expecto_patronum() {
		System.out.println("You protected yourself from dark magic!");
		if (ctx.location.equals("Dining Hall")) {
			System.out.println("The door on the east leads to the Potions Classroom.");
		} else if (ctx.location.equals("Potions Classroom")) {
			System.out.println(
					"Now you can now use the cauldron and ingredients to make the Polyjuice potion or the invisibility potion to proceed without anyone recognizing you...\nThehe door on the west leads to the Library");
		} else if (ctx.location.equals("Library")) {
			System.out.println("You can look for Hermione now and use two potions to leave.");
		}
	}
}
