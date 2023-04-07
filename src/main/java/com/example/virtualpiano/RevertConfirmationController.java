package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;

public class RevertConfirmationController {
    @FXML protected void onYesBC(ActionEvent event) throws IOException {
        mySettings.revertKeysToDefault();
        MenuSwitch.SettingsMenu(event);
    }
    @FXML protected void onNoBC(ActionEvent event) throws IOException {
        MenuSwitch.SettingsMenu(event);
    }
}
