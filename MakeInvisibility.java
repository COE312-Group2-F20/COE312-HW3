
public class MakeInvisibility implements Command {
	MakePotion potion;

	MakeInvisibility(MakePotion p) {
		this.potion = p;
	}

	@Override
	public void execute() {
		potion.makeInvisibility();
	}

}
