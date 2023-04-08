package com.example.virtualpiano;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class SelectGameController implements Initializable {

    public static String sequence = new String();

    public static int id;
    @FXML
    public TableView <SongSearchModel> tableView = new TableView<>();
    @FXML
    public TableColumn <SongSearchModel, String> NAME = new TableColumn<>();

    ObservableList <SongSearchModel> songSearchModelObservableList = FXCollections.observableArrayList();
    @FXML private Label allSongs;
    @FXML private Label Verdict;
    @FXML protected TextField txtfld;
    @FXML public void onCancelBC(ActionEvent event) throws IOException {
        MenuSwitch.MainMenu(event);
    }
    @FXML public void onSelectBC(ActionEvent event) throws IOException
    {
        try{
//            id = Integer.parseInt(txtfld.getText());
            String seq = txtfld.getText();
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
//        SQL.getAllSongs();
//        String temp = SQL.getAllGames();
//        allSongs.setText(temp);
//        Verdict.setText("");

        String GameName;
//        String ret = new String();
        String sqlQuery;
        try{
            // step1 load the driver class
            Class.forName(SQL.className);

            // step2 create the connection object
            Connection con = DriverManager.getConnection(SQL.url, SQL.username, SQL.password);
            sqlQuery = "select NAME from game";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {

                GameName = rs.getString("NAME");
                System.out.println(GameName);
                 songSearchModelObservableList.add(new SongSearchModel(GameName));
//                 tableView.getColumns().add( searching_col);


            }
             NAME.setCellValueFactory(new PropertyValueFactory<>("NAME"));
             tableView.setItems( songSearchModelObservableList);

            FilteredList< SongSearchModel> filteredData = new FilteredList<>( songSearchModelObservableList, b -> true);

            txtfld.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(songSearchModel -> {
                    if (newValue.isBlank() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (songSearchModel.getNAME().toLowerCase().indexOf(searchKeyword) > -1) {
                        return true;
                    } else {
                        return false;
                    }
                });
            });




            SortedList< SongSearchModel> sortedData = new SortedList<>(filteredData);

            sortedData.comparatorProperty().bind(tableView.comparatorProperty());

            tableView.setItems(sortedData);

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }

    @FXML
    public void onSongClick(javafx.scene.input.MouseEvent mouseEvent) {
        Integer index = tableView.getSelectionModel().getSelectedIndex();
        if(index <= -1){
            return;
        }

        String songName = NAME.getCellData(index).toString();

        changeScene_mouse(mouseEvent);

        System.out.println(songName);
        sequence = SQL.getGameSequence_fromTableView(songName);

        System.out.println( "From On Song click Function " + sequence);
    }

    private void changeScene_mouse(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(VirtualPianoMain.class.getResource("game_searchByPreference.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}