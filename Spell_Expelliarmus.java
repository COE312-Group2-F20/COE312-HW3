
public class Spell_Expelliarmus implements Command {

	Spell spell;

	Spell_Expelliarmus(Spell spell) {
		this.spell = spell;
	}

	@Override
	public void execute() {
		spell.expelliarmus();
	}

}
