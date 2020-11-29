import java.util.concurrent.TimeUnit;

public class Harry extends ConcreteObserver implements Runnable {

	String location;
	boolean notfound = true;
	int time;
	int potion;

	Harry(Subject subject, String l, int p) {

		super(subject);
		this.location = l;
		this.potion = p;
		Thread t = new Thread(this);
		t.start();

	}

	void setloc(String loc) {
		this.location = loc;
	}

	synchronized void UrgentClose() {
		System.out.print("You have 10 seconds to close the map.\n\n>");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("You have been caught... and the Marauder's map has been confiscated.");
		System.exit(2);
	}

	synchronized void CallHermione() {
		if (location.equals("Library")) {
			if (potion == 2) {
				try {
					TimeUnit.MILLISECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.print("Harry: Found Hermione!\n\n>");
				notfound = false;
			}
		}

	}

	String getloc() {
		return location;
	}

	@Override
	public void run() {
		while (notfound) {
			CallHermione();

		}
	}

	void setTime(int n) {
		time = n;
	}

	int getTime() {
		return time;
	}

	public void update(int n) {
		setTime(n);
		if (n == 5) {
			UrgentClose();
		}

	}
}