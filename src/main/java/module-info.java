module com.example.csc325_firebase_webview_auth {
    requires javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires javafx.graphics;
    requires jdk.jsobject;
    requires java.xml;
    requires java.logging;
    requires javafx.web;
    requires com.google.auth.oauth2;
    requires transitive google.cloud.firestore;
    requires firebase.admin;
    requires com.google.api.apicommon;
    requires google.cloud.core;
    requires com.google.auth;

    opens com.example.csc325_firebase_webview_auth.viewmodel to jdk.jsobject;
    opens com.example.csc325_firebase_webview_auth.view to javafx.fxml;

    exports com.example.csc325_firebase_webview_auth.viewmodel;
    exports com.example.csc325_firebase_webview_auth.view;
    exports com.example.csc325_firebase_webview_auth.model;
}