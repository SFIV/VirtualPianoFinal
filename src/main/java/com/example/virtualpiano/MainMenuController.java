package com.example.virtualpiano;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
    @FXML
    public Button Button_PlayGame;
    @FXML private Label usernameLabel = new Label();
    @FXML private Label StreakOnScreen;
    @FXML protected void onLogoutBC(ActionEvent event) throws IOException {
        mySettings.LoggedIn = false;
        mySettings.revertKeysToDefault();
        MenuSwitch.MasterMenu(event);
    }

    @FXML protected void onPlayPianoBC(ActionEvent event) throws IOException {
        MenuSwitch.PianoButton(event);
    }
    @FXML protected void onChatBC(ActionEvent event) throws IOException {
        MenuSwitch.Chat(event);
    }
    @FXML protected void onPlayGameBC(ActionEvent event) throws IOException {
        MenuSwitch.SelectGame(event);
    }

    @FXML protected void onSettingsBC(ActionEvent event) throws IOException {
        MenuSwitch.SettingsMenu(event);
    }

    @FXML
    protected void onExitBC()
    {
        Platform.exit();
    }

    public void initialize(URL url, ResourceBundle rb) {
        StreakOnScreen.setText(Integer.toString(mySettings.streak));
        usernameLabel.setText(mySettings.Username);
    }
}
