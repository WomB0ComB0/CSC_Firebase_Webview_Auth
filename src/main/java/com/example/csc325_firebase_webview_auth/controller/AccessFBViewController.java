package com.example.csc325_firebase_webview_auth.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccessFBViewController {

  @FXML
  private void showRegistrationForm() throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/RegistrationForm.fxml"));
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
  }

  @FXML
  private void showSignInForm() throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/SignInForm.fxml"));
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
  }

  @FXML
    private void showWebView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/WebContainer.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void showAccessFBView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/AccessFBView.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void showSplashScreen() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/SplashScreen.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void showApp() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/App.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void showAccessFBViewController() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/AccessFBViewController.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }


  @FXML
  private void showSplashScreenController() throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/SplashScreenController.fxml"));
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.show();
  }
}