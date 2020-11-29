
public class ControlPanel {
	Command[] slots;
	Command undocommand = null;

	public ControlPanel(Command[] slots) {
		this.slots = slots;
	}

	public void buttonpressed(int index) {
		slots[index].execute();
		undocommand = slots[index];
	}
}
