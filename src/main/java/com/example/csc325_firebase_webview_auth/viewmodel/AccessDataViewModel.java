package com.example.csc325_firebase_webview_auth.viewmodel;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AccessDataViewModel {

	private final StringProperty userName = new SimpleStringProperty();
	private final StringProperty userMajor = new SimpleStringProperty();
	private final StringProperty userAge = new SimpleStringProperty();
	private final ReadOnlyBooleanWrapper writePossible = new ReadOnlyBooleanWrapper();

	public AccessDataViewModel() {
		writePossible.bind(userName.isNotEmpty().and(userMajor.isNotEmpty()).and(userAge.isNotEmpty()));
	}

	public StringProperty userNameProperty() {
		return userName;
	}

	public StringProperty userMajorProperty() {
		return userMajor;
	}

	public StringProperty userAgeProperty() {
		return userAge;
	}

	public ReadOnlyBooleanProperty isWritePossibleProperty() {
		return writePossible.getReadOnlyProperty();
	}
}