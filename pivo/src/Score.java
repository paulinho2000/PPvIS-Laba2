public class Score {
	protected int playerScoreCounter;

	protected int computerScoreCounter;
	
	private Field field;

	public Score(Field field) {
		this.setField(field);
	}

	public int withdrawPlayerPoints() {
		return computerScoreCounter;
	}

	public int withdrawComputerPoints() {
		return computerScoreCounter;
	}

	public boolean discoverWinner() {
		return false;
	}

	public String displayWinner() {
		return null;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

}