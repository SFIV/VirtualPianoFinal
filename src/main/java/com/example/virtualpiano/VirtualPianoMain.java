package com.example.virtualpiano;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.Key;

public class VirtualPianoMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("MasterMenu.fxml"));

        stage.setResizable(false);
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        stage.setTitle("Virtual Piano - By HUNDRED");
        Image icon = new Image(mySettings.iconPath);
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void codeInit()
    {
        for (KeyCode keyCode : KeyCode.values()) {
            mySettings.KeycodeToInt(keyCode, true);
            mySettings.KeycodeToInt(keyCode, false);
        }
    }

    public static void main(String[] args)
    {
        // setting up the char to codes;
        codeInit();
        launch();
    }
}