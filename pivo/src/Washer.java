import java.awt.Color;

public class Washer{
	private int mousePosition;

	private boolean mouseStillness;

	protected Color color;
	
	private WasherModel model;
	
	private Field field;	
	
	public Washer(Field field) {
		this.field = field;
		this.model = new WasherModel();
	}
    
    public int MouseOnField() {
		return mousePosition;}

	public int interactWithBat() {
		return mousePosition;}

	public int moveOnX() {
		return mousePosition;}

	public int moveOnY() {
		return mousePosition;}
	
	}