package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import javafx.scene.control.Alert;

public class Login {
  private FirebaseAuth auth;

  @FXML
  private TextField email;

  @FXML
  private TextField emailFieldLogin;

  @FXML
  private void initialize() {
    auth = FirebaseAuth.getInstance();
  }

  @FXML
  public boolean registerUser() {
    UserRecord.CreateRequest request = new UserRecord.CreateRequest()
        .setEmail(email.getText())
        .setEmailVerified(false)
        .setDisabled(false);

    UserRecord userRecord;
    try {
      userRecord = auth.createUser(request);
      System.out.println("Successfully created new user: " + userRecord.getUid());
      return true;
    } catch (FirebaseAuthException ex) {
      ex.printStackTrace();
      return false;
    }
  }

  @FXML
  public void loginUser() {
    String email = emailFieldLogin.getText();
    try {
      UserRecord userRecord = auth.getUserByEmail(email);

      App.setRoot("/fxml/AccessFBView.fxml");
    } catch (FirebaseAuthException e) {
      Alert alert = new Alert(Alert.AlertType.ERROR);
      alert.setTitle("Error");
      alert.setHeaderText("Email not in system");
      alert.setContentText("Please register");
      alert.showAndWait();
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}