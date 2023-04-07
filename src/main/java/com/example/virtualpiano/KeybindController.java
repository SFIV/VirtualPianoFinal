package com.example.virtualpiano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class KeybindController implements Initializable {
    @FXML
    private Rectangle key01 = new Rectangle(), key02 = new Rectangle(), key03 = new Rectangle(), key04 = new Rectangle(),
            key05 = new Rectangle(), key06 = new Rectangle(), key07 = new Rectangle(), key08 = new Rectangle(),
            key09 = new Rectangle(), key10 = new Rectangle(), key11 = new Rectangle(), key12 = new Rectangle(),
            key13 = new Rectangle(), key14 = new Rectangle(), key15 = new Rectangle(), key16 = new Rectangle(),
            key17 = new Rectangle(), key18 = new Rectangle(), key19 = new Rectangle(), key20 = new Rectangle(),
            key21 = new Rectangle(), key22 = new Rectangle(), key23 = new Rectangle(), key24 = new Rectangle(),
            key25 = new Rectangle(), key26 = new Rectangle(), key27 = new Rectangle(), key28 = new Rectangle(),
            key29 = new Rectangle(), key30 = new Rectangle(), key31 = new Rectangle(), key32 = new Rectangle(),
            key33 = new Rectangle(), key34 = new Rectangle(), key35 = new Rectangle(), key36 = new Rectangle(),
            key37 = new Rectangle(), key38 = new Rectangle(), key39 = new Rectangle(), key40 = new Rectangle(),
            key41 = new Rectangle(), key42 = new Rectangle(), key43 = new Rectangle(), key44 = new Rectangle(),
            key45 = new Rectangle(), key46 = new Rectangle(), key47 = new Rectangle(), key48 = new Rectangle(),
            key49 = new Rectangle(), key50 = new Rectangle(), key51 = new Rectangle(), key52 = new Rectangle(),
            key53 = new Rectangle(), key54 = new Rectangle(), key55 = new Rectangle(), key56 = new Rectangle(),
            key57 = new Rectangle(), key58 = new Rectangle(), key59 = new Rectangle(), key60 = new Rectangle(),
            key61 = new Rectangle();
    @FXML public Label l01 = new Label(), l02 = new Label(), l03 = new Label(), l04 = new Label(), l05 = new Label(), l06 = new Label(), l07 = new Label(), l08 = new Label(), l09 = new Label(), l10 = new Label(),
            l11 = new Label(), l12 = new Label(), l13 = new Label(), l14 = new Label(), l15 = new Label(), l16 = new Label(), l17 = new Label(), l18 = new Label(), l19 = new Label(), l20 = new Label(),
            l21 = new Label(), l22 = new Label(), l23 = new Label(), l24 = new Label(), l25 = new Label(), l26 = new Label(), l27 = new Label(), l28 = new Label(), l29 = new Label(), l30 = new Label(),
            l31 = new Label(), l32 = new Label(), l33 = new Label(), l34 = new Label(), l35 = new Label(), l36 = new Label(), l37 = new Label(), l38 = new Label(), l39 = new Label(), l40 = new Label(),
            l41 = new Label(), l42 = new Label(), l43 = new Label(), l44 = new Label(), l45 = new Label(), l46 = new Label(), l47 = new Label(), l48 = new Label(), l49 = new Label(), l50 = new Label(),
            l51 = new Label(), l52 = new Label(), l53 = new Label(), l54 = new Label(), l55 = new Label(), l56 = new Label(), l57 = new Label(), l58 = new Label(), l59 = new Label(), l60 = new Label(),
            l61 = new Label();

    @FXML public Label Verdict;

    @FXML protected void onGoBackBC(ActionEvent event) throws IOException {
        MenuSwitch.SettingsMenu(event);
    }

    public int buttonToBeChanged = -1;
    @FXML
    void onButtonPress01() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 1;
    }

    @FXML
    void onButtonPress02() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 2;
    }

    @FXML
    void onButtonPress03() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 3;
    }

    @FXML
    void onButtonPress04() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 4;
    }

    @FXML
    void onButtonPress05() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 5;
    }

    @FXML
    void onButtonPress06() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 6;
    }

    @FXML
    void onButtonPress07() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 7;
    }

    @FXML
    void onButtonPress08() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 8;
    }

    @FXML
    void onButtonPress09() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 9;
    }

    @FXML
    void onButtonPress10() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 10;
    }

    @FXML
    void onButtonPress11() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 11;
    }

    @FXML
    void onButtonPress12() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 12;
    }

    @FXML
    void onButtonPress13() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 13;
    }

    @FXML
    void onButtonPress14() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 14;
    }

    @FXML
    void onButtonPress15() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 15;
    }

    @FXML
    void onButtonPress16() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 16;
    }

    @FXML
    void onButtonPress17() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 17;
    }

    @FXML
    void onButtonPress18() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 18;
    }

    @FXML
    void onButtonPress19() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 19;
    }

    @FXML
    void onButtonPress20() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 20;
    }

    @FXML
    void onButtonPress21() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 21;
    }

    @FXML
    void onButtonPress22() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 22;
    }

    @FXML
    void onButtonPress23() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 23;
    }

    @FXML
    void onButtonPress24() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 24;
    }

    @FXML
    void onButtonPress25() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 25;
    }

    @FXML
    void onButtonPress26() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 26;
    }

    @FXML
    void onButtonPress27() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 27;
    }

    @FXML
    void onButtonPress28() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 28;
    }

    @FXML
    void onButtonPress29() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 29;
    }

    @FXML
    void onButtonPress30() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 30;
    }

    @FXML
    void onButtonPress31() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 31;
    }

    @FXML
    void onButtonPress32() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 32;
    }

    @FXML
    void onButtonPress33() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 33;
    }

    @FXML
    void onButtonPress34() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 34;
    }

    @FXML
    void onButtonPress35() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 35;
    }

    @FXML
    void onButtonPress36() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 36;
    }

    @FXML
    void onButtonPress37() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 37;
    }

    @FXML
    void onButtonPress38() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 38;
    }

    @FXML
    void onButtonPress39() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 39;
    }

    @FXML
    void onButtonPress40() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 40;
    }

    @FXML
    void onButtonPress41() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 41;
    }

    @FXML
    void onButtonPress42() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 42;
    }

    @FXML
    void onButtonPress43() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 43;
    }

    @FXML
    void onButtonPress44() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 44;
    }

    @FXML
    void onButtonPress45() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 45;
    }

    @FXML
    void onButtonPress46() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 46;
    }

    @FXML
    void onButtonPress47() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 47;
    }

    @FXML
    void onButtonPress48() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 48;
    }

    @FXML
    void onButtonPress49() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 49;
    }

    @FXML
    void onButtonPress50() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 50;
    }

    @FXML
    void onButtonPress51() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 51;
    }

    @FXML
    void onButtonPress52() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 52;
    }

    @FXML
    void onButtonPress53() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 53;
    }

    @FXML
    void onButtonPress54() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 54;
    }

    @FXML
    void onButtonPress55() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 55;
    }

    @FXML
    void onButtonPress56() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 56;
    }

    @FXML
    void onButtonPress57() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 57;
    }

    @FXML
    void onButtonPress58() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 58;
    }

    @FXML
    void onButtonPress59() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 59;
    }

    @FXML
    void onButtonPress60() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 60;
    }

    @FXML
    void onButtonPress61() {
        Verdict.setText("Press a key to rebind the button. (Do not use control keys)"); buttonToBeChanged = 61;
    }

    public void initialize(URL url, ResourceBundle rb)
    {
        Verdict.setText("Select a button first");
//        System.out.println(mySettings.intCodetoChar(mySettings.buttonToCode[1]));
        l01.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[1]]));
        l02.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[2]]));
        l03.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[3]]));
        l04.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[4]]));
        l05.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[5]]));
        l06.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[6]]));
        l07.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[7]]));
        l08.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[8]]));
        l09.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[9]]));
        l10.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[10]]));
        l11.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[11]]));
        l12.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[12]]));
        l13.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[13]]));
        l14.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[14]]));
        l15.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[15]]));
        l16.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[16]]));
        l17.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[17]]));
        l18.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[18]]));
        l19.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[19]]));
        l20.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[20]]));
        l21.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[21]]));
        l22.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[22]]));
        l23.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[23]]));
        l24.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[24]]));
        l25.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[25]]));
        l26.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[26]]));
        l27.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[27]]));
        l28.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[28]]));
        l29.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[29]]));
        l30.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[30]]));
        l31.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[31]]));
        l32.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[32]]));
        l33.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[33]]));
        l34.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[34]]));
        l35.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[35]]));
        l36.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[36]]));
        l37.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[37]]));
        l38.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[38]]));
        l39.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[39]]));
        l40.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[40]]));
        l41.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[41]]));
        l42.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[42]]));
        l43.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[43]]));
        l44.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[44]]));
        l45.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[45]]));
        l46.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[46]]));
        l47.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[47]]));
        l48.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[48]]));
        l49.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[49]]));
        l50.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[50]]));
        l51.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[51]]));
        l52.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[52]]));
        l53.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[53]]));
        l54.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[54]]));
        l55.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[55]]));
        l56.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[56]]));
        l57.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[57]]));
        l58.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[58]]));
        l59.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[59]]));
        l60.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[60]]));
        l61.setText(Character.toString(mySettings.intCodeToChar[mySettings.buttonToCode[61]]));

    }
}
