package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ThePlayer extends BorderPane {
	
	Media media;
	MediaPlayer player;
	MediaView view;
	Pane mpane;
	BarForMedia bar;
	public ThePlayer(String file){
		media = new Media(file);
		player = new  MediaPlayer(media);
		view = new MediaView(player);
		mpane = new Pane();
		
		mpane.getChildren().add(view);
		
		setCenter(mpane);
		
		bar = new BarForMedia(player);
		
		setBottom(bar);
		
		setStyle("-fx-background-color: #bfc2c7");
		
		player.play();
	}
}
