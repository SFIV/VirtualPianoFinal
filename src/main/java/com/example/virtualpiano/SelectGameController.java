package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectGameController implements Initializable {

    public static int id;
    @FXML private Label allSongs;
    @FXML private Label Verdict;
    @FXML protected TextField txtfld;
    @FXML public void onCancelBC(ActionEvent event) throws IOException {
        MenuSwitch.MainMenu(event);
    }
    @FXML public void onSelectBC(ActionEvent event) throws IOException
    {
        try{
            id = Integer.parseInt(txtfld.getText());
            String seq = SQL.getGameSequence(id);
            if(seq.length() == 0)
                Verdict.setText("Select a valid game id");
            else
            {
                MenuSwitch.game(event);
            }
        }
        catch (NumberFormatException e)
        {
            Verdict.setText("Select a valid game id");
        }
    }
    public void initialize(URL url, ResourceBundle rb) {
        String temp = SQL.getAllGames();
        allSongs.setText(temp);
        Verdict.setText("");
    }
}