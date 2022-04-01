package application;
	
import java.awt.event.ActionEvent;
import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

public class Main extends Application  {
	private double setX = 0;
    private double setY = 0;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        
		root.setOnMousePressed(event -> {
            setX = event.getSceneX();
            setY = event.getSceneY();
        });

        //move around here
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX() - setX);
            primaryStage.setY(event.getScreenY() - setY);
        });
        Scene scene = new Scene(root);
        
        //set transparent
        scene.setFill(Color.TRANSPARENT);
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("../images/Icon.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
        
	}

	public static void main(String[] args) {
		launch(args);
	}
}
