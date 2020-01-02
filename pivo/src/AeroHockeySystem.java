import javafx.application.Application;
import javafx.stage.Stage;

public class AeroHockeySystem extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		SystemInitializator injector = new SystemInitializator();
		PlayerUI playerUI = injector.initialize();
		playerUI.mainMenu();
    }
}
