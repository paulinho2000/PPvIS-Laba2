import java.awt.Color;

public class Bat {
	private int mousePosition;

	protected Color color;
	
	private BatModel model;
	
	private Field field;

	public Bat(Field field) {
		this.model = new BatModel();
		this.field = field;
	}

	public boolean stay() {
		return false;
	}

	public int discoverSpeed() {
		return mousePosition;
	}

	public int mouseMoving() {
		return mousePosition;
	}

	public int moveOnX() {
		return mousePosition;
	}

	public int moveOnY() {
		return mousePosition;
	}

	public int interactWithWasher() {
		return mousePosition;
	}

	public BatModel getModel() {
		return model;
	}

	public void setModel(BatModel model) {
		this.model = model;
	}

}