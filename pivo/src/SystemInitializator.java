
public class SystemInitializator {
	public PlayerUI initialize() {
		Player player = new Player();
		PlayerController controller = new PlayerController(player);
		PlayerUI ui = new PlayerUI(new Field(), controller);
		return ui;
	}
}
