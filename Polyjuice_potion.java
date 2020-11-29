
public class Polyjuice_potion extends Recipe {

	@Override
	void Add() {
		System.out.println("Adding fluxweed and lacewings in cauldron...");

	}

	@Override
	void Stir() {
		System.out.println("Stirring 4 times clockwise...");

	}

	@Override
	void WaveWand() {
		System.out.println("Waving hand to complete brewing...");

	}

	public boolean needWaveWand() {
		return true;
	}

}
