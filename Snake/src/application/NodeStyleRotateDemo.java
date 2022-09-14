package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class NodeStyleRotateDemo extends Application 
{ 
	@Override
	public void start(Stage primaryStage) 
	{ 
		StackPane pane = new StackPane(); 
		Button btOK = new Button("OK");
		btOK.setStyle("-fx-border-color: blue;"); 
		pane.getChildren().add(btOK); 
		pane.setRotate(45);
		pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;"); 
		Scene scene = new Scene(pane, 200, 250); 
		primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title 
		primaryStage.setScene(scene); // Place the scene in the stage 
		primaryStage.show(); // Display the stage


	}

	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) 
	{
		launch(args);
	}
}
