package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class LoginMenuController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label Verdict;
    @FXML protected void onGoBackBC(ActionEvent event) throws IOException {
        MenuSwitch.MasterMenu(event);
    }
    @FXML protected void onLoginBC(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if(SQL.CheckUsernameAvailability(username))
        {
            Verdict.setText("USER HAS NOT REGISTERED");
        } else if(!SQL.checkPassword(username, password))
        {
            Verdict.setText("PASSWORD NOT CORRECT");
        }
        else
        {
            mySettings.LoggedIn = true;
            mySettings.Password = password;
            SQL.loadSettings(username);
            mySettings.Username = username;
            SQL.saveSettings(username);
            MenuSwitch.MainMenu(event);
        }
    }
}
