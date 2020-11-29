
public class Context {

	private State state = new Main_Hall();
	String location;
	String character;

	public void previousState() {
		state.prev(this);
	}

	public void nextState(String location) {
		this.location = location;
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	public void setState(State state) {
		this.state = state;
	}
}
