package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class PasswordChangeController {
    @FXML protected PasswordField newPass = new PasswordField();
    @FXML protected PasswordField confirmPass = new PasswordField();
    @FXML protected Label Verdict;
    @FXML protected void onGoBackBC(ActionEvent event) throws IOException {
        MenuSwitch.SettingsMenu(event);
    }
    @FXML protected void onChangePasswordBC(ActionEvent event) throws IOException {
        String newPassword = newPass.getText();
        String confPassword = confirmPass.getText();
        if(newPassword.length() < 4)
        {
            Verdict.setText("Password must be atleast 4 characters long");
            return;
        }
        if(newPassword.equals(confPassword))
        {
            Verdict.setText("");
            mySettings.Password = newPassword;
            MenuSwitch.SettingsMenu(event);
        }
        else
        {
            Verdict.setText("Password confirmation did not match");
        }
    }
}
