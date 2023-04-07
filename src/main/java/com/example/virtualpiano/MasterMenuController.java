package com.example.virtualpiano;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MasterMenuController {
    @FXML
    protected void onPlayPianoBC(ActionEvent event) throws IOException {
        mySettings.revertKeysToDefault();
        MenuSwitch.PianoButton(event);
    }
    @FXML
    protected void onLoginBC(ActionEvent event) throws IOException {
        MenuSwitch.LoginMenu(event);
    }
    @FXML
    protected void onRegisterBC(ActionEvent event) throws IOException
    {
        MenuSwitch.RegisterMenu(event);
    }
    @FXML
    protected void onExitBC()
    {
        Platform.exit();
    }

    @FXML
    protected void onThemeChangeBC(ActionEvent event) throws IOException {
        mySettings.darkMode = (mySettings.darkMode + 1)%2;
        MenuSwitch.MasterMenu(event);
    }
}
