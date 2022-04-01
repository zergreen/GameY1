package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.sun.glass.events.MouseEvent;
import com.sun.javafx.application.HostServicesDelegate;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.*;



	public class HomeController implements Initializable {
	@FXML
	private JFXButton closeButton, closeButton1, closeButton2, closeButton3, minimizeButton, minimizeButton1, minimizeButton2, minimizeButton3, homeButton, tutorialButton, creatorButton, toolButton, blogButton, playButton, randomButton, showAnsButton;
	
	@FXML
	private AnchorPane home, tutorial, creator, tool; 
	@FXML
	private Label jokeLabel, jokeAnsLabel;

	@FXML
	private void handleButtonAction(ActionEvent event) {
		
		 }

	int x;

	@Override
	public void initialize(URL location, ResourceBundle resources)  {

		random();
		jokeLabel.setText(Joke.JOKES[x]);
		closeButton.setOnAction(actionEvent -> Platform.exit());
		closeButton1.setOnAction(actionEvent -> Platform.exit());
		closeButton2.setOnAction(actionEvent -> Platform.exit());
		closeButton3.setOnAction(actionEvent -> Platform.exit());
		
		minimizeButton.setOnAction(e -> {
		    ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
		});
		minimizeButton1.setOnAction(e -> {
		    ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
		});
		minimizeButton2.setOnAction(e -> {
		    ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
		});
		minimizeButton3.setOnAction(e -> {
		    ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true);
		});
		
		homeButton.setOnAction(e -> {
			home.setVisible(true);
			tutorial.setVisible(false);
			creator.setVisible(false);
			tool.setVisible(false);
		});
		tutorialButton.setOnAction(e -> {
			home.setVisible(false);
			tutorial.setVisible(true);
			creator.setVisible(false);
			tool.setVisible(false);
		});
		creatorButton.setOnAction(e -> {
			home.setVisible(false);
			tutorial.setVisible(false);
			creator.setVisible(true);
			tool.setVisible(false);
		});
		toolButton.setOnAction(e -> {
			home.setVisible(false);
			tutorial.setVisible(false);
			creator.setVisible(false);
			tool.setVisible(true);
		});
		blogButton.setOnAction(e -> {
			blog();
		});
		randomButton.setOnAction(e -> {
			random();
			jokeLabel.setText(Joke.JOKES[x]);
			jokeAnsLabel.setText(" ");
		});
		showAnsButton.setOnAction(e -> {
			jokeAnsLabel.setText(Joke.ANSWERS[x]);
		});
		playButton.setOnAction(e -> {
			try {
				Process process = Runtime.getRuntime().exec("C:\\Program Files\\Game\\src\\application\\run.exe");
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
			Platform.exit();
		});
		}
	
		public static void blog() {
			try {
				String s = "http://www.google.com";
				Desktop desktop = Desktop.getDesktop();
				desktop.browse(URI.create(s));
            } catch (IOException e) {
                
            }
			
		}
		
		public int random() {
			Random rand = new Random();
			x=rand.nextInt(Joke.JOKES.length);
			return x;
		}
}
