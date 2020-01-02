public class BatModel {
	private int positionOnX;

	private int positionOnY;
	
	public BatModel() {
		this.positionOnX = 0;
		this.positionOnY = 0;
	}

	public int getPositionOnX() {
		return positionOnX;
	}

	public void setPositionOnX(int positionOnX) {
		this.positionOnX = positionOnX;
	}

	public int getPositionOnY() {
		return positionOnY;
	}

	public void setPositionOnY(int positionOnY) {
		this.positionOnY = positionOnY;
	}

	public int mouseOnField() {
		return positionOnX;
	}

	public int discoverSpeed() {
		return positionOnX;
	}

}