package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;

public class SettingMenuController {
    @FXML protected void onSaveBC(ActionEvent event) throws IOException {
        SQL.saveSettings(mySettings.Username);
        MenuSwitch.MainMenu(event);
    }
    @FXML protected void onToggleDarkModeBC(ActionEvent event) throws IOException {
        mySettings.darkMode = (mySettings.darkMode + 1)%2;
        MenuSwitch.SettingsMenu(event);
    }

    @FXML protected void onChangePasswordBC(ActionEvent event) throws IOException {
        MenuSwitch.PasswordChange(event);
    }

    @FXML protected void onCancelBC(ActionEvent event) throws IOException {
        MenuSwitch.MainMenu(event);
    }
    @FXML protected void onRevertBC(ActionEvent event) throws IOException {
        MenuSwitch.RevertConfirmation(event);
    }
    @FXML protected void onChangeKeybindsBC(ActionEvent event) throws IOException {
        MenuSwitch.keybindChange(event);
    }

    @FXML protected void onOpenRecordFolderBC(){
        mySettings.openFolder(mySettings.folderPath);
    }
}
