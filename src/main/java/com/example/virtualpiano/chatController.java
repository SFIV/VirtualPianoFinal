package com.example.virtualpiano;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.util.Duration.seconds;

public class chatController implements Initializable {

    protected Timeline timeline;
    @FXML
    protected Button SendButton;
    @FXML
    protected Button RefreshButton;
    @FXML
    protected Label MessageArea;
    @FXML
    protected TextField Message;

    @FXML
    void setSendButtonClick() {
        String messageAreaString = MessageArea.getText();
        String messageString = Message.getText();
        Message.setText("");
        SQL.saveMessage(mySettings.Username, messageString);
        messageAreaString += mySettings.Username + ": " + messageString + "\n";//Change from Nothing to Username
        MessageArea.setText(messageAreaString);
    }

    @FXML
    void onRefreshButtonClick() {
        String messageAreaString = SQL.getMessage();
        MessageArea.setText(messageAreaString);
    }

    @FXML
    void onGoBackButtonClick(ActionEvent event) throws IOException
    {
        // backButton wherever
        timeline.stop();
        MenuSwitch.MainMenu(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        timeline = new Timeline(new KeyFrame(seconds(10), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // Decrement Time by 1 secon
               onRefreshButtonClick();
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }
}
