package com.example.csc325_firebase_webview_auth.view;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.IOException;

public class LandingPage {

  @FXML
  private ImageView imageView;

  public void initialize() {
    Image image = new Image(getClass().getResourceAsStream("/images/logo.png"));
    imageView.setImage(image);

    PauseTransition pause = new PauseTransition(Duration.seconds(3));
    pause.setOnFinished(event -> {
      try {
        App.setRoot("/fxml/Login.fxml");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
    pause.play();
  }
}
