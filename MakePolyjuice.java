
public class MakePolyjuice implements Command {

	MakePotion potion;

	MakePolyjuice(MakePotion p) {
		this.potion = p;
	}

	@Override
	public void execute() {
		potion.makePolyjuice();
	}

}
