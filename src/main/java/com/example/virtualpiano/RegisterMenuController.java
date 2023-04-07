package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterMenuController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField passwordCheckField;
    @FXML private Label Verdict;
    @FXML protected void onGoBackBC(ActionEvent event) throws IOException {
        MenuSwitch.MasterMenu(event);
    }
    @FXML protected void onRegisterBC(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String passwordCheck = passwordCheckField.getText();
        if(!SQL.CheckUsernameAvailability(username))
        {
            Verdict.setText("USERNAME NOT AVAILABLE");
        } else if(password.length() < 4)
        {
            Verdict.setText("PASSWORD NOT LONG ENOUGH");
        }
        else if(!password.equals(passwordCheck))
        {
            Verdict.setText("PASSWORD DOES NOT MATCH WITH THE CHECK");
        }
        else
        {
            mySettings.revertKeysToDefault();
            SQL.addUser(username, password);
            MenuSwitch.MasterMenu(event);
        }
    }
}
