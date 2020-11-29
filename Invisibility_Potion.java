
public class Invisibility_Potion extends Recipe {

	@Override
	void Add() {
		System.out.println("Adding cherries and spiders in cauldron...");

	}

	@Override
	void Stir() {
		System.out.println("Stirring 3 times anticlockwise...");

	}

	@Override
	void WaveWand() {
	}

	public boolean needWaveWand() {
		return false;
	}

}
