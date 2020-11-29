
public class Spell_Stupefy implements Command {

	Spell spell;

	Spell_Stupefy(Spell spell) {
		this.spell = spell;
	}

	@Override
	public void execute() {
		spell.stupefy();
	}

}
