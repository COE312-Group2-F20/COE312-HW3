
public abstract class Recipe {
	final void prepareRecipe() {
		Add();
		Stir();
		Heat();
		if (needWaveWand()) {
			WaveWand();
		}
		System.out.println("Potion is ready!");
	}

	private boolean needWaveWand() {
		return true;

	}

	protected void Heat() {
		System.out.println("Heating at a high temperature...");
	}

	abstract void Add();

	abstract void Stir();

	abstract void WaveWand();
}
