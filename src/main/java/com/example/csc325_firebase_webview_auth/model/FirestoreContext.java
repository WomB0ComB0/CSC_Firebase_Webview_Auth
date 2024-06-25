package com.example.csc325_firebase_webview_auth.model;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author MoaathAlrajab
 */
public class FirestoreContext {

    @SuppressWarnings("deprecation")
    public Firestore firebase() {
        try (InputStream serviceAccount = getClass().getResourceAsStream("/json/env.json")) {
            if (serviceAccount == null) {
                throw new IOException("Firebase service account key file not found");
            }

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
            FirebaseApp.initializeApp(options);
            System.out.println("Firebase is initialized");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return FirestoreClient.getFirestore();
    }
}