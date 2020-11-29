
public class Spell_Expecto_Patronum implements Command {

	Spell spell;

	Spell_Expecto_Patronum(Spell spell) {
		this.spell = spell;
	}

	@Override
	public void execute() {
		spell.expecto_patronum();
	}

}
