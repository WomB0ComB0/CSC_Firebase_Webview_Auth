package com.example.csc325_firebase_webview_auth.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import com.example.csc325_firebase_webview_auth.view.App;

public class RegistrationFormController {

  @FXML
  private TextField emailField;

  @FXML
  private PasswordField passwordField;

  @FXML
  private void handleRegister() {
    String email = emailField.getText();
    String password = passwordField.getText();
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
    try {
        App.setRoot("/fxml/WebContainer.fxml");
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}