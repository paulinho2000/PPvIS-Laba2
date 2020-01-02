import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class PlayerUI {
	private Field field;
	
	private PlayerController controller;
	
	public PlayerUI(Field field, PlayerController controller) {
		this.controller = controller;
		this.field = field;
	}
	
	public void mainMenu() {
		Button startGame = new Button("Начало игры");
		Button endGame = new Button("Выход из игры");
		endGame.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	Platform.exit();
                System.exit(0);
        }});
		
	}
	
	public void gameWindow() {
		
	}
	
	public void pauseWindow() {
		
	}
}
