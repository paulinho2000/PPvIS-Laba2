import java.awt.Color;

public class GameModel {
	private int height;
	
	private int width;

	private Color background;
	
	private int centralBorderX;

	private int centralBorderY;

	private int upperGate;

    private int bottomGate;
    
    private Score score;
	
	
	public GameModel() {
		this.score = new Score(new Field());
	}
	
	public void checkWasherPosition() {}
	
	public void checkPlayerBatPosition() {}

	public void checkComputerBatPosition() {}

	}