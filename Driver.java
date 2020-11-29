import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase;
		String choice;
		int potion = 0;
		int poly = 0;
		int inv = 0;
		String Bellatrix = "not fought";
		String Snape = "not fought";
		String Draco = "not fought";
		Scanner obj = new Scanner(System.in);
		Watch watch = new Watch();
		Harry harry = new Harry(watch, "Main Hall", potion);
		Hermione hermione = new Hermione("Library", harry);
		System.out.print(
				"\"Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to magical Mischief-Makers are proud to present THE MARAUDER'S MAP.\n"
						+ "Say the magic phrase to reveal the map.\n>");
		phrase = obj.nextLine();
		while (phrase != null) {
			if (!phrase.equals("I solemnly swear that I am up to no good")) {
				System.out.print("Wrong magic phrase... Try again!\n>");
				phrase = obj.nextLine();
			} else if (phrase.equals("Mischief managed")) {

				System.exit(2);
			} else {
				break;
			}
		}

		Context con = new Context();
		con.printStatus();

		MakePotion makepotion = new MakePotion();
		MakePolyjuice makepoly = new MakePolyjuice(makepotion);// (0)
		MakeInvisibility makeinvisi = new MakeInvisibility(makepotion);// (1)

		Look look = new Look(con);// (2)

		Move move = new Move(con);
		Move_East move_east = new Move_East(move);// (3)
		Move_West move_west = new Move_West(move);// (4)
		Move_North move_north = new Move_North(move);// (5)
		Move_Main_Hall move_mainhall = new Move_Main_Hall(move);// (6)

		Spell spell = new Spell(con);
		Spell_Stupefy spell_stu = new Spell_Stupefy(spell);// (7)
		Spell_Protego spell_pro = new Spell_Protego(spell);// (8)
		Spell_Expelliarmus spell_exp = new Spell_Expelliarmus(spell);// (9)
		Spell_Expecto_Patronum spell_exp_pat = new Spell_Expecto_Patronum(spell);// (10)

		Command[] cmds = { makepoly, makeinvisi, look, move_east, move_west, move_north, move_mainhall, spell_stu,
				spell_pro, spell_exp, spell_exp_pat };
		ControlPanel p = new ControlPanel(cmds);

		System.out.print(
				"\n***************\nThis is actions menu (Beware: everything is case-sensitive): \n1. Walk East\n2. Walk West\n3. Walk North\n4. Go to Main Hall\n***************\n\n>");

		choice = obj.nextLine();

		while (!choice.equals("Mischief managed")) {
			if (choice.equals("Make Polyjuice Potion")) {
				if (Snape.equals("fought")) {
					if (harry.getloc().equals("Potions Classroom")) {
						p.buttonpressed(0);
						poly++;
						harry.potion++;
						System.out.println("You now have " + poly + " flasks of Polyjuice");

					} else {
						System.out.println("Cannot do Polyjuice potion in this room");
					}
				} else
					System.out.println(
							"There is an enemy in here you have to fight before you proceed! Try looking around.");

			} else if (choice.equals("Make Invisibility Potion")) {
				if (Snape.equals("fought")) {

					if (harry.getloc().equals("Potions Classroom")) {
						p.buttonpressed(1);
						inv++;
						harry.potion++;
						System.out.println("You now have " + inv + " flasks of Invisibility Potion");

					} else {
						System.out.println("Cannot do Invisibility potion in this room");
					}
				} else
					System.out.println(
							"There is an enemy in here you have to fight before you proceed! Try looking around.");

			} else if (choice.equals("Look around")) {
				p.buttonpressed(2);
			} else if (choice.equals("Walk East")) {
				harry.setloc("Potions Classroom");
				p.buttonpressed(3);

			} else if (choice.equals("Walk West")) {
				harry.setloc("Library");
				p.buttonpressed(4);

			}

			else if (choice.equals("Walk North")) {
				p.buttonpressed(5);
				harry.setloc("Dining Hall");

			} else if (choice.equals("Go to Main Hall")) {

				if (harry.getloc().equals("Dining Hall") && (Bellatrix.equals("fought"))) {
					p.buttonpressed(6);

					harry.setloc("Main Hall");
				} else if (harry.getloc().equals("Potions Classroom") && (Snape.equals("fought"))) {
					p.buttonpressed(6);

					harry.setloc("Main Hall");
				} else if (harry.getloc().equals("Library") && (Draco.equals("fought"))) {
					p.buttonpressed(6);

					harry.setloc("Main Hall");
				} else
					System.out.println(
							"There is an enemy in here you have to fight before you proceed! Try looking around.");

			} else if (choice.equals("Stupefy")) {
				p.buttonpressed(7);
				if (harry.getloc().equals("Dining Hall")) {
					Bellatrix = "fought";
				} else if (harry.getloc().equals("Library")) {
					Draco = "fought";
				} else if (harry.getloc().equals("Potions Classroom")) {
					Snape = "fought";
				}
			} else if (choice.equals("Protego")) {
				p.buttonpressed(8);
				if (harry.getloc().equals("Dining Hall")) {
					Bellatrix = "fought";
				} else if (harry.getloc().equals("Library")) {
					Draco = "fought";
				} else if (harry.getloc().equals("Potions Classroom")) {
					Snape = "fought";
				}

			} else if (choice.equals("Expelliarmus")) {
				p.buttonpressed(9);
				if (harry.getloc().equals("Dining Hall")) {
					Bellatrix = "fought";
				} else if (harry.getloc().equals("Library")) {
					Draco = "fought";
				} else if (harry.getloc().equals("Potions Classroom")) {
					Snape = "fought";
				}

			} else if (choice.equals("Expecto Patronum")) {
				p.buttonpressed(10);
				if (harry.getloc().equals("Dining Hall")) {
					Bellatrix = "fought";
				} else if (harry.getloc().equals("Library")) {
					Draco = "fought";
				} else if (harry.getloc().equals("Potions Classroom")) {
					Snape = "fought";
				}

			} else
				System.out.println("This command is not available, choose again!");

			if (harry.getloc().equals("Main Hall")) {
				System.out.print(
						"\n***************\nThis is actions menu (Beware: everything is case-sensitive): \n1. Walk East\n2. Walk West\n3. Walk North\n4. Go to Main Hall\n***************\n\n>");
			} else if (harry.getloc().equals("Potions Classroom")) {
				System.out.print(
						"\n***************\n1. Look around\n2. Make Polyjuice Potion\n3. Make Invisibility Potion\n4. Expecto Patronum\n5. Stupefy\n6. Protego\n7. Expelliarmus\n8. Go to Main Hall\n***************\n\n>");
			} else {
				System.out.print(
						"\n***************\n1. Look around\n2. Expecto Patronum\n3. Stupefy\n4. Protego\n5. Expelliarmus\n6. Go to Main Hall\n***************\n\n>");
			}

			choice = obj.nextLine();

		}

		System.out.println("Hiding map contents...end.");
		System.exit(1);
		obj.close();

	}

}
