package com.example.csc325_firebase_webview_auth.controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SplashScreenController {

  @FXML
  private Label welcomeLabel;

  @FXML
  private ImageView splashImageView;

  @FXML
  public void initialize() {
    try {
      welcomeLabel.setText("Welcome to the App");
      initializeSplashImage();
    } catch (Exception e) {
      handleInitializationError(e);
    }
  }

  /**
   * Initializes the splash image with a fade-in and fade-out animation.
   */
  private void initializeSplashImage() {
    Image splashImage = new Image("/images/logo.png");
    splashImageView.setImage(splashImage);

    FadeTransition fadeIn = new FadeTransition(Duration.millis(300), splashImageView);
    fadeIn.setFromValue(0.0);
    fadeIn.setToValue(1.0);
    fadeIn.setCycleCount(1);

    FadeTransition fadeOut = new FadeTransition(Duration.millis(300), splashImageView);
    fadeOut.setFromValue(1.0);
    fadeOut.setToValue(0.0);
    fadeOut.setCycleCount(1);

    fadeIn.setOnFinished(event -> fadeOut.play());
    fadeOut.setOnFinished(event -> fadeIn.play());

    fadeIn.play();
  }

  /**
   * Updates the welcome message on the splash screen.
   * @param message The new welcome message.
   */
  public void updateWelcomeMessage(String message) {
    welcomeLabel.setText(message);
  }

  /**
   * Handles any errors that occur during initialization.
   * @param e The exception that was thrown.
   */
  private void handleInitializationError(Exception e) {
    // Log the error or show an alert to the user
    System.err.println("Error during initialization: " + e.getMessage());
  }
}