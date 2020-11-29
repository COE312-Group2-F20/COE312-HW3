import java.util.concurrent.TimeUnit;

public class Hermione implements Runnable {
	String location;
	Harry harry;
	boolean running = true;

	Hermione(String l, Harry h) {
		this.location = l;
		this.harry = h;
		Thread t = new Thread(this);
		t.start();
	}

	synchronized void callHarry() {
		if (harry.getloc().equals("Library")) {
			if (harry.potion == 2) {
				try {
					TimeUnit.MILLISECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hermione: Harry, I am here!");
				running = false;
			}
		}
	}

	@Override
	public void run() {
		while (running) {
			callHarry();

		}

	}
}
