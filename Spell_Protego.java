
public class Spell_Protego implements Command {

	Spell spell;

	Spell_Protego(Spell spell) {
		this.spell = spell;
	}

	@Override
	public void execute() {
		spell.protego();
	}

}
