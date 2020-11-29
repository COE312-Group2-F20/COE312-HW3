import java.util.concurrent.TimeUnit;

public class Watch extends ConcreteSubject implements Runnable {
	int time = 0;
	int endtime = 0;
	Harry harry;

	Watch() {
		Thread t = new Thread(this);
		t.start();
	}

	int getTime() {
		return time;
	}

	int getEndTime() {
		return endtime;
	}

	@Override
	public void run() {
		while (true) {
			notifyObserver(time);
			time = time + 1;
			try {
				TimeUnit.MINUTES.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\n" + time + " minutes passed...\n");

		}
	}
}
