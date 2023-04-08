package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import javax.sound.midi.*;
import java.io.IOException;

public class MenuSwitch {
    private static int correct = 0; // easter egg
    public static void LoginMenu(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();

        FXMLLoader fxmlLoader;
        if(mySettings.darkMode%2 == 1)
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("LoginMenu.fxml"));
        mystage.setResizable(false); //////////////
        }
        else {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("LoginMenuWhite.fxml"));

        }


        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Login for Virtual Piano");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();

        LoginMenuController loginMenuController = fxmlLoader.getController();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                try {
                    if (keyEvent.getCode() == KeyCode.ESCAPE)
                    {
                        FXMLLoader fx;
                        if(mySettings.darkMode%2 == 1)
                        {
                            fx = new FXMLLoader(VirtualPianoMain.class.getResource("MasterMenu.fxml"));
                        }
                        else {
                            fx = new FXMLLoader(VirtualPianoMain.class.getResource("MasterMenuWhite.fxml"));
                        }
                        Scene sc = new Scene(fx.load(), mySettings.X, mySettings.Y);
                        mystage.setTitle("Virtual Piano - By HUNDRED");
                        mystage.setScene(sc);
                        mystage.centerOnScreen();
                        mystage.show();
                    }
                }catch (Exception e)
                {
                    System.out.println("Exception occurred: " + e);
                }
            }
        });
    }
    public static void SelectGame(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("selectGame.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Select a game to play");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }

    public static void game(ActionEvent event) throws IOException{
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Virtual Piano");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();

        sequenceGameController SequenceGameController = fxmlLoader.getController();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                try{
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[1])
                        SequenceGameController.onButtonPress01();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[2])
                        SequenceGameController.onButtonPress02();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[3])
                        SequenceGameController.onButtonPress03();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[4])
                        SequenceGameController.onButtonPress04();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[5])
                        SequenceGameController.onButtonPress05();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[6])
                        SequenceGameController.onButtonPress06();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[7])
                        SequenceGameController.onButtonPress07();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[8])
                        SequenceGameController.onButtonPress08();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[9])
                        SequenceGameController.onButtonPress09();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[10])
                        SequenceGameController.onButtonPress10();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[11])
                        SequenceGameController.onButtonPress11();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[12])
                        SequenceGameController.onButtonPress12();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[13])
                        SequenceGameController.onButtonPress13();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[14])
                        SequenceGameController.onButtonPress14();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[15])
                        SequenceGameController.onButtonPress15();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[16])
                        SequenceGameController.onButtonPress16();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[17])
                        SequenceGameController.onButtonPress17();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[18])
                        SequenceGameController.onButtonPress18();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[19])
                        SequenceGameController.onButtonPress19();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[20])
                        SequenceGameController.onButtonPress20();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[21])
                        SequenceGameController.onButtonPress21();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[22])
                        SequenceGameController.onButtonPress22();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[23])
                        SequenceGameController.onButtonPress23();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[24])
                        SequenceGameController.onButtonPress24();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[25])
                        SequenceGameController.onButtonPress25();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[26])
                        SequenceGameController.onButtonPress26();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[27])
                        SequenceGameController.onButtonPress27();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[28])
                        SequenceGameController.onButtonPress28();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[29])
                        SequenceGameController.onButtonPress29();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[30])
                        SequenceGameController.onButtonPress30();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[31])
                        SequenceGameController.onButtonPress31();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[32])
                        SequenceGameController.onButtonPress32();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[33])
                        SequenceGameController.onButtonPress33();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[34])
                        SequenceGameController.onButtonPress34();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[35])
                        SequenceGameController.onButtonPress35();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[36])
                        SequenceGameController.onButtonPress36();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[37])
                        SequenceGameController.onButtonPress37();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[38])
                        SequenceGameController.onButtonPress38();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[39])
                        SequenceGameController.onButtonPress39();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[40])
                        SequenceGameController.onButtonPress40();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[41])
                        SequenceGameController.onButtonPress41();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[42])
                        SequenceGameController.onButtonPress42();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[43])
                        SequenceGameController.onButtonPress43();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[44])
                        SequenceGameController.onButtonPress44();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[45])
                        SequenceGameController.onButtonPress45();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[46])
                        SequenceGameController.onButtonPress46();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[47])
                        SequenceGameController.onButtonPress47();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[48])
                        SequenceGameController.onButtonPress48();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[49])
                        SequenceGameController.onButtonPress49();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[50])
                        SequenceGameController.onButtonPress50();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[51])
                        SequenceGameController.onButtonPress51();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[52])
                        SequenceGameController.onButtonPress52();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[53])
                        SequenceGameController.onButtonPress53();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[54])
                        SequenceGameController.onButtonPress54();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[55])
                        SequenceGameController.onButtonPress55();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[56])
                        SequenceGameController.onButtonPress56();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[57])
                        SequenceGameController.onButtonPress57();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[58])
                        SequenceGameController.onButtonPress58();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[59])
                        SequenceGameController.onButtonPress59();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[60])
                        SequenceGameController.onButtonPress60();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[61])
                        SequenceGameController.onButtonPress61();
                }catch (Exception e)
                {
                    System.out.println("Exception occurred: " + e);
                }
            }
        });

    }
    public static void Chat(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("chat.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Global chat");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }
    public static void MasterMenu(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader;

        if (mySettings.darkMode%2 == 1)
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("MasterMenu.fxml"));
        }
        else
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("MasterMenuWhite.fxml"));
        }
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Virtual Piano - By HUNDRED");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }
    public static void SettingsMenu(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader;

        if (mySettings.darkMode%2 == 1)
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("SettingMenu.fxml"));
        }
        else
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("SettingMenuWhite.fxml"));
        }
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Change your settings");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }

    public static void PasswordChange(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader;

        if (mySettings.darkMode%2 == 1)
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("PasswordChange.fxml"));
        }
        else
        {
            fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("PasswordChangeWhite.fxml"));
        }
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Change your password");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }
    public static void RevertConfirmation(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("RevertConfirmation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Confirm");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }
    public static void RegisterMenu(ActionEvent event) throws IOException
    {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader;
        if (mySettings.darkMode%2 == 1)
        fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("RegisterMenu.fxml"));
        else fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("RegisterMenuWhite.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Registration for Virtual Piano");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();
    }
    public static void MainMenu(ActionEvent event) throws IOException
    {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader;
        if (mySettings.darkMode%2 == 1)
        fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("MainMenu.fxml"));
        else fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("MainMenuWhite.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), mySettings.X, mySettings.Y);
        mystage.setTitle("Main Menu");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();

        MainMenuController mainMenuController = fxmlLoader.getController();
        correct = 0;
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                try{
                    if(keyEvent.getCode() == KeyCode.H && correct == 0)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.U && correct == 1)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.N && correct == 2)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.D && correct == 3)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.R && correct == 4)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.E && correct == 5)
                        correct++;
                    else if(keyEvent.getCode() == KeyCode.D && correct == 6)
                        correct++;
                    else correct = 0;
                    if(correct == 7)
                    {
                        correct = 0;
                        Piano_Controller.MIDI_CHANNEL = 9; // drums
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
    public static void keybindChange(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("Keybind.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Change your keybinds");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();

        KeybindController keybindController = fxmlLoader.getController();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                try
                {
                    if(keybindController.buttonToBeChanged != -1)
                    {
                        if(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()) == '\0') return;
                        if(keybindController.buttonToBeChanged == 1)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l01.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 1;
                            mySettings.buttonToCode[1] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 2)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l02.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 2;
                            mySettings.buttonToCode[2] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 3)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l03.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 3;
                            mySettings.buttonToCode[3] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 4)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l04.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 4;
                            mySettings.buttonToCode[4] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 5)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l05.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 5;
                            mySettings.buttonToCode[5] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 6)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l06.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 6;
                            mySettings.buttonToCode[6] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 7)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l07.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 7;
                            mySettings.buttonToCode[7] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 8)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l08.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 8;
                            mySettings.buttonToCode[8] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 9)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l09.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 9;
                            mySettings.buttonToCode[9] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 10)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l10.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 10;
                            mySettings.buttonToCode[10] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 11)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l11.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 11;
                            mySettings.buttonToCode[11] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 12)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l12.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 12;
                            mySettings.buttonToCode[12] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 13)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l13.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 13;
                            mySettings.buttonToCode[13] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 14)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l14.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 14;
                            mySettings.buttonToCode[14] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 15)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l15.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 15;
                            mySettings.buttonToCode[15] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 16)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l16.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 16;
                            mySettings.buttonToCode[16] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 17)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l17.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 17;
                            mySettings.buttonToCode[17] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 18)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l18.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 18;
                            mySettings.buttonToCode[18] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 19)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l19.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 19;
                            mySettings.buttonToCode[19] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 20)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l20.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 20;
                            mySettings.buttonToCode[20] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 21)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l21.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 21;
                            mySettings.buttonToCode[21] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 22)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l22.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 22;
                            mySettings.buttonToCode[22] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 23)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l23.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 23;
                            mySettings.buttonToCode[23] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 24)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l24.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 24;
                            mySettings.buttonToCode[24] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 25)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l25.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 25;
                            mySettings.buttonToCode[25] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 26)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l26.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 26;
                            mySettings.buttonToCode[26] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 27)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l27.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 27;
                            mySettings.buttonToCode[27] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 28)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l28.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 28;
                            mySettings.buttonToCode[28] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 29)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l29.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 29;
                            mySettings.buttonToCode[29] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 30)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l30.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 30;
                            mySettings.buttonToCode[30] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 31)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l31.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 31;
                            mySettings.buttonToCode[31] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 32)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l32.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 32;
                            mySettings.buttonToCode[32] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 33)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l33.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 33;
                            mySettings.buttonToCode[33] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 34)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l34.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 34;
                            mySettings.buttonToCode[34] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 35)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l35.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 35;
                            mySettings.buttonToCode[35] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 36)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l36.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 36;
                            mySettings.buttonToCode[36] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 37)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l37.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 37;
                            mySettings.buttonToCode[37] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 38)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l38.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 38;
                            mySettings.buttonToCode[38] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 39)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l39.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 39;
                            mySettings.buttonToCode[39] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 40)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l40.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 40;
                            mySettings.buttonToCode[40] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 41)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l41.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 41;
                            mySettings.buttonToCode[41] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 42)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l42.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 42;
                            mySettings.buttonToCode[42] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 43)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l43.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 43;
                            mySettings.buttonToCode[43] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 44)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l44.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 44;
                            mySettings.buttonToCode[44] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 45)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l45.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 45;
                            mySettings.buttonToCode[45] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 46)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l46.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 46;
                            mySettings.buttonToCode[46] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 47)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l47.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 47;
                            mySettings.buttonToCode[47] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 48)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l48.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 48;
                            mySettings.buttonToCode[48] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 49)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l49.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 49;
                            mySettings.buttonToCode[49] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 50)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l50.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 50;
                            mySettings.buttonToCode[50] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 51)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l51.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 51;
                            mySettings.buttonToCode[51] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 52)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l52.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 52;
                            mySettings.buttonToCode[52] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 53)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l53.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 53;
                            mySettings.buttonToCode[53] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 54)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l54.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 54;
                            mySettings.buttonToCode[54] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 55)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l55.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 55;
                            mySettings.buttonToCode[55] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 56)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l56.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 56;
                            mySettings.buttonToCode[56] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 57)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l57.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 57;
                            mySettings.buttonToCode[57] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 58)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l58.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 58;
                            mySettings.buttonToCode[58] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 59)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l59.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 59;
                            mySettings.buttonToCode[59] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 60)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l60.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 60;
                            mySettings.buttonToCode[60] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        if(keybindController.buttonToBeChanged == 61)
                        {
                            String ch = String.valueOf(mySettings.generateChar(keyEvent.getCode(), keyEvent.isShiftDown()));
                            keybindController.l61.setText(ch);
                            mySettings.codeToButton[mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown())] = 61;
                            mySettings.buttonToCode[61] = mySettings.KeycodeToInt(keyEvent.getCode(), keyEvent.isShiftDown());
                        }
                        keybindController.Verdict.setText("Select a button first");
                        keybindController.buttonToBeChanged = -1;
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Exception occured: " + e);
                }
            }
        });
    }
    public static void PianoButton(ActionEvent event) throws IOException {
        Node CallingButton = (Node) event.getSource();
        Stage mystage = (Stage) CallingButton.getScene().getWindow();
        mystage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(VirtualPianoMain.class.getResource("Piano.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mystage.setTitle("Virtual Piano");
        mystage.setScene(scene);
        mystage.centerOnScreen();
        mystage.show();

        Piano_Controller pianoController = fxmlLoader.getController();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                try{
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[1])
                        pianoController.onButtonPress01();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[2])
                        pianoController.onButtonPress02();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[3])
                        pianoController.onButtonPress03();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[4])
                        pianoController.onButtonPress04();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[5])
                        pianoController.onButtonPress05();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[6])
                        pianoController.onButtonPress06();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[7])
                        pianoController.onButtonPress07();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[8])
                        pianoController.onButtonPress08();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[9])
                        pianoController.onButtonPress09();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[10])
                        pianoController.onButtonPress10();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[11])
                        pianoController.onButtonPress11();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[12])
                        pianoController.onButtonPress12();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[13])
                        pianoController.onButtonPress13();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[14])
                        pianoController.onButtonPress14();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[15])
                        pianoController.onButtonPress15();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[16])
                        pianoController.onButtonPress16();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[17])
                        pianoController.onButtonPress17();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[18])
                        pianoController.onButtonPress18();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[19])
                        pianoController.onButtonPress19();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[20])
                        pianoController.onButtonPress20();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[21])
                        pianoController.onButtonPress21();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[22])
                        pianoController.onButtonPress22();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[23])
                        pianoController.onButtonPress23();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[24])
                        pianoController.onButtonPress24();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[25])
                        pianoController.onButtonPress25();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[26])
                        pianoController.onButtonPress26();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[27])
                        pianoController.onButtonPress27();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[28])
                        pianoController.onButtonPress28();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[29])
                        pianoController.onButtonPress29();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[30])
                        pianoController.onButtonPress30();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[31])
                        pianoController.onButtonPress31();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[32])
                        pianoController.onButtonPress32();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[33])
                        pianoController.onButtonPress33();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[34])
                        pianoController.onButtonPress34();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[35])
                        pianoController.onButtonPress35();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[36])
                        pianoController.onButtonPress36();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[37])
                        pianoController.onButtonPress37();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[38])
                        pianoController.onButtonPress38();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[39])
                        pianoController.onButtonPress39();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[40])
                        pianoController.onButtonPress40();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[41])
                        pianoController.onButtonPress41();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[42])
                        pianoController.onButtonPress42();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[43])
                        pianoController.onButtonPress43();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[44])
                        pianoController.onButtonPress44();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[45])
                        pianoController.onButtonPress45();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[46])
                        pianoController.onButtonPress46();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[47])
                        pianoController.onButtonPress47();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[48])
                        pianoController.onButtonPress48();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[49])
                        pianoController.onButtonPress49();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[50])
                        pianoController.onButtonPress50();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[51])
                        pianoController.onButtonPress51();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[52])
                        pianoController.onButtonPress52();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[53])
                        pianoController.onButtonPress53();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[54])
                        pianoController.onButtonPress54();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[55])
                        pianoController.onButtonPress55();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[56])
                        pianoController.onButtonPress56();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[57])
                        pianoController.onButtonPress57();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[58])
                        pianoController.onButtonPress58();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[59])
                        pianoController.onButtonPress59();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[60])
                        pianoController.onButtonPress60();
                    if(mySettings.KeycodeToInt(event.getCode(), event.isShiftDown()) == mySettings.buttonToCode[61])
                        pianoController.onButtonPress61();
                }catch (Exception e)
                {
                    System.out.println("Exception occurred: " + e);
                }
            }
        });

    }
};
