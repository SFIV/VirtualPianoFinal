package com.example.virtualpiano;

import javafx.animation.FillTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.FillTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javax.sound.midi.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.sound.midi.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javax.sound.midi.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class sequenceGameController implements Initializable{

    MidiChannel channel;
    public static int MIDI_CHANNEL = 0;
    //    private static int MIDI_CHANNEL = 9;
    private static int VELOCITY = 75;

    @FXML private Label recordingName;
    @FXML private Label recordTime;
    @FXML private Slider mySlider;

    private static int mySliderInt;
    private static Double DURATION_SECONDS = .075;
    private static int OFFSET = +12;
    private Color setTransitionColor = Color.rgb(164, 85, 237);

    private boolean recording = false;
    myTime timeRecord = new myTime("0:0:0");
    Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(1),
                    e-> {
                        if(recording == true)
                        {
                            timeRecord.oneSecondPassed();
                            recordTime.setText(timeRecord.getCurrentTime());
                        }
                    }));
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
    @FXML private Label l01 = new Label(), l02 = new Label(), l03 = new Label(), l04 = new Label(), l05 = new Label(), l06 = new Label(), l07 = new Label(), l08 = new Label(), l09 = new Label(), l10 = new Label(),
            l11 = new Label(), l12 = new Label(), l13 = new Label(), l14 = new Label(), l15 = new Label(), l16 = new Label(), l17 = new Label(), l18 = new Label(), l19 = new Label(), l20 = new Label(),
            l21 = new Label(), l22 = new Label(), l23 = new Label(), l24 = new Label(), l25 = new Label(), l26 = new Label(), l27 = new Label(), l28 = new Label(), l29 = new Label(), l30 = new Label(),
            l31 = new Label(), l32 = new Label(), l33 = new Label(), l34 = new Label(), l35 = new Label(), l36 = new Label(), l37 = new Label(), l38 = new Label(), l39 = new Label(), l40 = new Label(),
            l41 = new Label(), l42 = new Label(), l43 = new Label(), l44 = new Label(), l45 = new Label(), l46 = new Label(), l47 = new Label(), l48 = new Label(), l49 = new Label(), l50 = new Label(),
            l51 = new Label(), l52 = new Label(), l53 = new Label(), l54 = new Label(), l55 = new Label(), l56 = new Label(), l57 = new Label(), l58 = new Label(), l59 = new Label(), l60 = new Label(),
            l61 = new Label();

    private FillTransition ft01 = new FillTransition(Duration.seconds(DURATION_SECONDS), key01, Color.WHITE, setTransitionColor);
    private FillTransition ft02 = new FillTransition(Duration.seconds(DURATION_SECONDS), key02, Color.BLACK, setTransitionColor);
    private FillTransition ft03 = new FillTransition(Duration.seconds(DURATION_SECONDS), key03, Color.WHITE, setTransitionColor);
    private FillTransition ft04 = new FillTransition(Duration.seconds(DURATION_SECONDS), key04, Color.BLACK, setTransitionColor);
    private FillTransition ft05 = new FillTransition(Duration.seconds(DURATION_SECONDS), key05, Color.WHITE, setTransitionColor);
    private FillTransition ft06 = new FillTransition(Duration.seconds(DURATION_SECONDS), key06, Color.WHITE, setTransitionColor);
    private FillTransition ft07 = new FillTransition(Duration.seconds(DURATION_SECONDS), key07, Color.BLACK, setTransitionColor);
    private FillTransition ft08 = new FillTransition(Duration.seconds(DURATION_SECONDS), key08, Color.WHITE, setTransitionColor);
    private FillTransition ft09 = new FillTransition(Duration.seconds(DURATION_SECONDS), key09, Color.BLACK, setTransitionColor);
    private FillTransition ft10 = new FillTransition(Duration.seconds(DURATION_SECONDS), key10, Color.WHITE, setTransitionColor);
    private FillTransition ft11 = new FillTransition(Duration.seconds(DURATION_SECONDS), key11, Color.BLACK, setTransitionColor);
    private FillTransition ft12 = new FillTransition(Duration.seconds(DURATION_SECONDS), key12, Color.WHITE, setTransitionColor);
    private FillTransition ft13 = new FillTransition(Duration.seconds(DURATION_SECONDS), key13, Color.WHITE, setTransitionColor);
    private FillTransition ft14 = new FillTransition(Duration.seconds(DURATION_SECONDS), key14, Color.BLACK, setTransitionColor);
    private FillTransition ft15 = new FillTransition(Duration.seconds(DURATION_SECONDS), key15, Color.WHITE, setTransitionColor);
    private FillTransition ft16 = new FillTransition(Duration.seconds(DURATION_SECONDS), key16, Color.BLACK, setTransitionColor);
    private FillTransition ft17 = new FillTransition(Duration.seconds(DURATION_SECONDS), key17, Color.WHITE, setTransitionColor);
    private FillTransition ft18 = new FillTransition(Duration.seconds(DURATION_SECONDS), key18, Color.WHITE, setTransitionColor);
    private FillTransition ft19 = new FillTransition(Duration.seconds(DURATION_SECONDS), key19, Color.BLACK, setTransitionColor);
    private FillTransition ft20 = new FillTransition(Duration.seconds(DURATION_SECONDS), key20, Color.WHITE, setTransitionColor);
    private FillTransition ft21 = new FillTransition(Duration.seconds(DURATION_SECONDS), key21, Color.BLACK, setTransitionColor);
    private FillTransition ft22 = new FillTransition(Duration.seconds(DURATION_SECONDS), key22, Color.WHITE, setTransitionColor);
    private FillTransition ft23 = new FillTransition(Duration.seconds(DURATION_SECONDS), key23, Color.BLACK, setTransitionColor);
    private FillTransition ft24 = new FillTransition(Duration.seconds(DURATION_SECONDS), key24, Color.WHITE, setTransitionColor);
    private FillTransition ft25 = new FillTransition(Duration.seconds(DURATION_SECONDS), key25, Color.WHITE, setTransitionColor);
    private FillTransition ft26 = new FillTransition(Duration.seconds(DURATION_SECONDS), key26, Color.BLACK, setTransitionColor);
    private FillTransition ft27 = new FillTransition(Duration.seconds(DURATION_SECONDS), key27, Color.WHITE, setTransitionColor);
    private FillTransition ft28 = new FillTransition(Duration.seconds(DURATION_SECONDS), key28, Color.BLACK, setTransitionColor);
    private FillTransition ft29 = new FillTransition(Duration.seconds(DURATION_SECONDS), key29, Color.WHITE, setTransitionColor);
    private FillTransition ft30 = new FillTransition(Duration.seconds(DURATION_SECONDS), key30, Color.WHITE, setTransitionColor);
    private FillTransition ft31 = new FillTransition(Duration.seconds(DURATION_SECONDS), key31, Color.BLACK, setTransitionColor);
    private FillTransition ft32 = new FillTransition(Duration.seconds(DURATION_SECONDS), key32, Color.WHITE, setTransitionColor);
    private FillTransition ft33 = new FillTransition(Duration.seconds(DURATION_SECONDS), key33, Color.BLACK, setTransitionColor);
    private FillTransition ft34 = new FillTransition(Duration.seconds(DURATION_SECONDS), key34, Color.WHITE, setTransitionColor);
    private FillTransition ft35 = new FillTransition(Duration.seconds(DURATION_SECONDS), key35, Color.BLACK, setTransitionColor);
    private FillTransition ft36 = new FillTransition(Duration.seconds(DURATION_SECONDS), key36, Color.WHITE, setTransitionColor);
    private FillTransition ft37 = new FillTransition(Duration.seconds(DURATION_SECONDS), key37, Color.WHITE, setTransitionColor);
    private FillTransition ft38 = new FillTransition(Duration.seconds(DURATION_SECONDS), key38, Color.BLACK, setTransitionColor);
    private FillTransition ft39 = new FillTransition(Duration.seconds(DURATION_SECONDS), key39, Color.WHITE, setTransitionColor);
    private FillTransition ft40 = new FillTransition(Duration.seconds(DURATION_SECONDS), key40, Color.BLACK, setTransitionColor);
    private FillTransition ft41 = new FillTransition(Duration.seconds(DURATION_SECONDS), key41, Color.WHITE, setTransitionColor);
    private FillTransition ft42 = new FillTransition(Duration.seconds(DURATION_SECONDS), key42, Color.WHITE, setTransitionColor);
    private FillTransition ft43 = new FillTransition(Duration.seconds(DURATION_SECONDS), key43, Color.BLACK, setTransitionColor);
    private FillTransition ft44 = new FillTransition(Duration.seconds(DURATION_SECONDS), key44, Color.WHITE, setTransitionColor);
    private FillTransition ft45 = new FillTransition(Duration.seconds(DURATION_SECONDS), key45, Color.BLACK, setTransitionColor);
    private FillTransition ft46 = new FillTransition(Duration.seconds(DURATION_SECONDS), key46, Color.WHITE, setTransitionColor);
    private FillTransition ft47 = new FillTransition(Duration.seconds(DURATION_SECONDS), key47, Color.BLACK, setTransitionColor);
    private FillTransition ft48 = new FillTransition(Duration.seconds(DURATION_SECONDS), key48, Color.WHITE, setTransitionColor);
    private FillTransition ft49 = new FillTransition(Duration.seconds(DURATION_SECONDS), key49, Color.WHITE, setTransitionColor);
    private FillTransition ft50 = new FillTransition(Duration.seconds(DURATION_SECONDS), key50, Color.BLACK, setTransitionColor);
    private FillTransition ft51 = new FillTransition(Duration.seconds(DURATION_SECONDS), key51, Color.WHITE, setTransitionColor);
    private FillTransition ft52 = new FillTransition(Duration.seconds(DURATION_SECONDS), key52, Color.BLACK, setTransitionColor);
    private FillTransition ft53 = new FillTransition(Duration.seconds(DURATION_SECONDS), key53, Color.WHITE, setTransitionColor);
    private FillTransition ft54 = new FillTransition(Duration.seconds(DURATION_SECONDS), key54, Color.WHITE, setTransitionColor);
    private FillTransition ft55 = new FillTransition(Duration.seconds(DURATION_SECONDS), key55, Color.BLACK, setTransitionColor);
    private FillTransition ft56 = new FillTransition(Duration.seconds(DURATION_SECONDS), key56, Color.WHITE, setTransitionColor);
    private FillTransition ft57 = new FillTransition(Duration.seconds(DURATION_SECONDS), key57, Color.BLACK, setTransitionColor);
    private FillTransition ft58 = new FillTransition(Duration.seconds(DURATION_SECONDS), key58, Color.WHITE, setTransitionColor);
    private FillTransition ft59 = new FillTransition(Duration.seconds(DURATION_SECONDS), key59, Color.BLACK, setTransitionColor);
    private FillTransition ft60 = new FillTransition(Duration.seconds(DURATION_SECONDS), key60, Color.WHITE, setTransitionColor);
    private FillTransition ft61 = new FillTransition(Duration.seconds(DURATION_SECONDS), key61, Color.WHITE, setTransitionColor);




    @FXML protected void onGoBackBC(ActionEvent event) throws IOException {
        if(mySettings.LoggedIn) MenuSwitch.MainMenu(event);
        else MenuSwitch.MasterMenu(event);
    }

    @FXML protected void onRecordBC(){
        if(recording == false)
        {
            recording = true;
            audioRecorder.start();
        }
        else
        {
            recording = false;
            audioRecorder.stop();
            recordTime.setText("");
            timeRecord.reset();
            recordingName.setText("Saved as : " + audioRecorder.fileName);
        }
    }


    @FXML
    void onButtonPress01() {
        ft01.setShape(key01);
        ft01.play();
        channel.noteOn(OFFSET +24, VELOCITY); // C2
    }

    @FXML
    void onButtonPress02() {
        ft02.setShape(key02);
        ft02.play();
        channel.noteOn(OFFSET +25, VELOCITY); // C#2
    }

    @FXML
    void onButtonPress03() {
        ft03.setShape(key03);
        ft03.play();
        channel.noteOn(OFFSET +26, VELOCITY); // D2
    }

    @FXML
    void onButtonPress04() {
        ft04.setShape(key04);
        ft04.play();
        channel.noteOn(OFFSET +27, VELOCITY); // D#2
    }

    @FXML
    void onButtonPress05() {
        ft05.setShape(key05);
        ft05.play();
        channel.noteOn(OFFSET +28, VELOCITY); // E2
    }

    @FXML
    void onButtonPress06() {
        ft06.setShape(key06);
        ft06.play();
        channel.noteOn(OFFSET +29, VELOCITY); // F2
    }

    @FXML
    void onButtonPress07() {
        ft07.setShape(key07);
        ft07.play();
        channel.noteOn(OFFSET +30, VELOCITY); // F#2
    }

    @FXML
    void onButtonPress08() {
        ft08.setShape(key08);
        ft08.play();
        channel.noteOn(OFFSET +31, VELOCITY); // G2
    }

    @FXML
    void onButtonPress09() {
        ft09.setShape(key09);
        ft09.play();
        channel.noteOn(OFFSET +32, VELOCITY); // G#2
    }

    @FXML
    void onButtonPress10() {
        ft10.setShape(key10);
        ft10.play();
        channel.noteOn(OFFSET +33, VELOCITY); // A2
    }

    @FXML
    void onButtonPress11() {
        ft11.setShape(key11);
        ft11.play();
        channel.noteOn(OFFSET +34, VELOCITY); // A#2
    }

    @FXML
    void onButtonPress12() {
        ft12.setShape(key12);
        ft12.play();
        channel.noteOn(OFFSET +35, VELOCITY); // B2
    }

    @FXML
    void onButtonPress13() {
        ft13.setShape(key13);
        ft13.play();
        channel.noteOn(OFFSET +36, VELOCITY); // C3
    }

    @FXML
    void onButtonPress14() {
        ft14.setShape(key14);
        ft14.play();
        channel.noteOn(OFFSET +37, VELOCITY); // C#3
    }

    @FXML
    void onButtonPress15() {
        ft15.setShape(key15);
        ft15.play();
        channel.noteOn(OFFSET +38, VELOCITY); // D3
    }

    @FXML
    void onButtonPress16() {
        ft16.setShape(key16);
        ft16.play();
        channel.noteOn(OFFSET +39, VELOCITY); // D#3
    }

    @FXML
    void onButtonPress17() {
        ft17.setShape(key17);
        ft17.play();
        channel.noteOn(OFFSET +40, VELOCITY); // E3
    }

    @FXML
    void onButtonPress18() {
        ft18.setShape(key18);
        ft18.play();
        channel.noteOn(OFFSET +41, VELOCITY); // F3
    }

    @FXML
    void onButtonPress19() {
        ft19.setShape(key19);
        ft19.play();
        channel.noteOn(OFFSET +42, VELOCITY); // F#3
    }

    @FXML
    void onButtonPress20() {
        ft20.setShape(key20);
        ft20.play();
        channel.noteOn(OFFSET +43, VELOCITY); // G3
    }

    @FXML
    void onButtonPress21() {
        ft21.setShape(key21);
        ft21.play();
        channel.noteOn(OFFSET +44, VELOCITY); // G#3
    }

    @FXML
    void onButtonPress22() {
        ft22.setShape(key22);
        ft22.play();
        channel.noteOn(OFFSET +45, VELOCITY); // A3
    }

    @FXML
    void onButtonPress23() {
        ft23.setShape(key23);
        ft23.play();
        channel.noteOn(OFFSET +46, VELOCITY); // A#3
    }

    @FXML
    void onButtonPress24() {
        ft24.setShape(key24);
        ft24.play();
        channel.noteOn(OFFSET +47, VELOCITY); // B3
    }

    @FXML
    void onButtonPress25() {
        ft25.setShape(key25);
        ft25.play();
        channel.noteOn(OFFSET +48, VELOCITY); // C4
    }

    @FXML
    void onButtonPress26() {
        ft26.setShape(key26);
        ft26.play();
        channel.noteOn(OFFSET +49, VELOCITY); // C#4
    }

    @FXML
    void onButtonPress27() {
        ft27.setShape(key27);
        ft27.play();
        channel.noteOn(OFFSET +50, VELOCITY); // D4
    }

    @FXML
    void onButtonPress28() {
        ft28.setShape(key28);
        ft28.play();
        channel.noteOn(OFFSET +51, VELOCITY); // D#4
    }

    @FXML
    void onButtonPress29() {
        ft29.setShape(key29);
        ft29.play();
        channel.noteOn(OFFSET +52, VELOCITY); // E4
    }

    @FXML
    void onButtonPress30() {
        ft30.setShape(key30);
        ft30.play();
        channel.noteOn(OFFSET +53, VELOCITY); // F4
    }

    @FXML
    void onButtonPress31() {
        ft31.setShape(key31);
        ft31.play();
        channel.noteOn(OFFSET +54, VELOCITY); // F#4
    }

    @FXML
    void onButtonPress32() {
        ft32.setShape(key32);
        ft32.play();
        channel.noteOn(OFFSET +55, VELOCITY); // G4
    }

    @FXML
    void onButtonPress33() {
        ft33.setShape(key33);
        ft33.play();
        channel.noteOn(OFFSET +56, VELOCITY); // G#4
    }

    @FXML
    void onButtonPress34() {
        ft34.setShape(key34);
        ft34.play();
        channel.noteOn(OFFSET +57, VELOCITY); // A4
    }

    @FXML
    void onButtonPress35() {
        ft35.setShape(key35);
        ft35.play();
        channel.noteOn(OFFSET +58, VELOCITY); // A#4
    }

    @FXML
    void onButtonPress36() {
        ft36.setShape(key36);
        ft36.play();
        channel.noteOn(OFFSET +59, VELOCITY); // B4
    }

    @FXML
    void onButtonPress37() {
        ft37.setShape(key37);
        ft37.play();
        channel.noteOn(OFFSET +60, VELOCITY); // C5
    }

    @FXML
    void onButtonPress38() {
        ft38.setShape(key38);
        ft38.play();
        channel.noteOn(OFFSET +61, VELOCITY); // C#5
    }

    @FXML
    void onButtonPress39() {
        ft39.setShape(key39);
        ft39.play();
        channel.noteOn(OFFSET +62, VELOCITY); // D5
    }

    @FXML
    void onButtonPress40() {
        ft40.setShape(key40);
        ft40.play();
        channel.noteOn(OFFSET +63, VELOCITY); // D#5
    }
    @FXML
    void onButtonPress41() {
        ft41.setShape(key41);
        ft41.play();
        channel.noteOn(OFFSET +64, VELOCITY); // E5
    }

    @FXML
    void onButtonPress42() {
        ft42.setShape(key42);
        ft42.play();
        channel.noteOn(OFFSET +65, VELOCITY); // F5
    }

    @FXML
    void onButtonPress43() {
        ft43.setShape(key43);
        ft43.play();
        channel.noteOn(OFFSET +66, VELOCITY); // F#5
    }

    @FXML
    void onButtonPress44() {
        ft44.setShape(key44);
        ft44.play();
        channel.noteOn(OFFSET +67, VELOCITY); // G5
    }

    @FXML
    void onButtonPress45() {
        ft45.setShape(key45);
        ft45.play();
        channel.noteOn(OFFSET +68, VELOCITY); // G#5
    }

    @FXML
    void onButtonPress46() {
        ft46.setShape(key46);
        ft46.play();
        channel.noteOn(OFFSET +69, VELOCITY); // A5
    }

    @FXML
    void onButtonPress47() {
        ft47.setShape(key47);
        ft47.play();
        channel.noteOn(OFFSET +70, VELOCITY); // A#5
    }

    @FXML
    void onButtonPress48() {
        ft48.setShape(key48);
        ft48.play();
        channel.noteOn(OFFSET +71, VELOCITY); // B5
    }

    @FXML
    void onButtonPress49() {
        ft49.setShape(key49);
        ft49.play();
        channel.noteOn(OFFSET +72, VELOCITY); // C6
    }

    @FXML
    void onButtonPress50() {
        ft50.setShape(key50);
        ft50.play();
        channel.noteOn(OFFSET +73, VELOCITY); // C#6
    }

    @FXML
    void onButtonPress51() {
        ft51.setShape(key51);
        ft51.play();
        channel.noteOn(OFFSET +74, VELOCITY); // D6
    }

    @FXML
    void onButtonPress52() {
        ft52.setShape(key52);
        ft52.play();
        channel.noteOn(OFFSET +75, VELOCITY); // D#6
    }

    @FXML
    void onButtonPress53() {
        ft53.setShape(key53);
        ft53.play();
        channel.noteOn(OFFSET +76, VELOCITY); // E6
    }

    @FXML
    void onButtonPress54() {
        ft54.setShape(key54);
        ft54.play();
        channel.noteOn(OFFSET +77, VELOCITY); // F6
    }

    @FXML
    void onButtonPress55() {
        ft55.setShape(key55);
        ft55.play();
        channel.noteOn(OFFSET +78, VELOCITY); // F#6
    }

    @FXML
    void onButtonPress56() {
        ft56.setShape(key56);
        ft56.play();
        channel.noteOn(OFFSET +79, VELOCITY); // G6
    }

    @FXML
    void onButtonPress57() {
        ft57.setShape(key57);
        ft57.play();
        channel.noteOn(OFFSET +80, VELOCITY); // G#6
    }

    @FXML
    void onButtonPress58() {
        ft58.setShape(key58);
        ft58.play();
        channel.noteOn(OFFSET +81, VELOCITY); // A6
    }

    @FXML
    void onButtonPress59() {
        ft59.setShape(key59);
        ft59.play();
        channel.noteOn(OFFSET +82, VELOCITY); // A#6
    }

    @FXML
    void onButtonPress60() {
        ft60.setShape(key60);
        ft60.play();
        channel.noteOn(OFFSET +83, VELOCITY); // B6
    }
    @FXML
    void onButtonPress61() {
        ft61.setShape(key61);
        ft61.play();
        channel.noteOn(OFFSET +84, VELOCITY); // C7
    }


    private void loadChannel() throws InvalidMidiDataException, IOException {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);

//            Soundbank soundbank = MidiSystem.getSoundbank(new File("Essential_Keys_sforzando-v9.6.sf2"));
//            Instrument[] instruments = soundbank.getInstruments();
//            Instrument instrument = instruments[11];
//            synth.loadInstrument(instrument);

            channel = synth.getChannels()[MIDI_CHANNEL];
        } catch (MidiUnavailableException e) {
            System.out.println("Cannot get Synthesizer");
            throw new RuntimeException(e);
        }
    }
    public sequenceGameController() throws InvalidMidiDataException, IOException {


        // Keys 01 to 20
        ft01.setCycleCount(2);
        ft01.setAutoReverse(true);

        ft02.setCycleCount(2);
        ft02.setAutoReverse(true);

        ft03.setCycleCount(2);
        ft03.setAutoReverse(true);

        ft04.setCycleCount(2);
        ft04.setAutoReverse(true);

        ft05.setCycleCount(2);
        ft05.setAutoReverse(true);

        ft06.setCycleCount(2);
        ft06.setAutoReverse(true);

        ft07.setCycleCount(2);
        ft07.setAutoReverse(true);

        ft08.setCycleCount(2);
        ft08.setAutoReverse(true);

        ft09.setCycleCount(2);
        ft09.setAutoReverse(true);

        ft10.setCycleCount(2);
        ft10.setAutoReverse(true);

        ft11.setCycleCount(2);
        ft11.setAutoReverse(true);

        ft12.setCycleCount(2);
        ft12.setAutoReverse(true);

        ft13.setCycleCount(2);
        ft13.setAutoReverse(true);

        ft14.setCycleCount(2);
        ft14.setAutoReverse(true);

        ft15.setCycleCount(2);
        ft15.setAutoReverse(true);

        ft16.setCycleCount(2);
        ft16.setAutoReverse(true);

        ft17.setCycleCount(2);
        ft17.setAutoReverse(true);

        ft18.setCycleCount(2);
        ft18.setAutoReverse(true);

        ft19.setCycleCount(2);
        ft19.setAutoReverse(true);

        ft20.setCycleCount(2);
        ft20.setAutoReverse(true);
        // Keys 21 to 41
        ft21.setCycleCount(2);
        ft21.setAutoReverse(true);

        ft22.setCycleCount(2);
        ft22.setAutoReverse(true);

        ft23.setCycleCount(2);
        ft23.setAutoReverse(true);

        ft24.setCycleCount(2);
        ft24.setAutoReverse(true);

        ft25.setCycleCount(2);
        ft25.setAutoReverse(true);

        ft26.setCycleCount(2);
        ft26.setAutoReverse(true);

        ft27.setCycleCount(2);
        ft27.setAutoReverse(true);

        ft28.setCycleCount(2);
        ft28.setAutoReverse(true);

        ft29.setCycleCount(2);
        ft29.setAutoReverse(true);

        ft30.setCycleCount(2);
        ft30.setAutoReverse(true);

        ft31.setCycleCount(2);
        ft31.setAutoReverse(true);

        ft32.setCycleCount(2);
        ft32.setAutoReverse(true);

        ft33.setCycleCount(2);
        ft33.setAutoReverse(true);

        ft34.setCycleCount(2);
        ft34.setAutoReverse(true);

        ft35.setCycleCount(2);
        ft35.setAutoReverse(true);

        ft36.setCycleCount(2);
        ft36.setAutoReverse(true);

        ft37.setCycleCount(2);
        ft37.setAutoReverse(true);

        ft38.setCycleCount(2);
        ft38.setAutoReverse(true);

        ft39.setCycleCount(2);
        ft39.setAutoReverse(true);

        ft40.setCycleCount(2);
        ft40.setAutoReverse(true);

        ft41.setCycleCount(2);
        ft41.setAutoReverse(true);
        // Keys 42 to 61
        ft42.setCycleCount(2);
        ft42.setAutoReverse(true);

        ft43.setCycleCount(2);
        ft43.setAutoReverse(true);

        ft44.setCycleCount(2);
        ft44.setAutoReverse(true);

        ft45.setCycleCount(2);
        ft45.setAutoReverse(true);

        ft46.setCycleCount(2);
        ft46.setAutoReverse(true);

        ft47.setCycleCount(2);
        ft47.setAutoReverse(true);

        ft48.setCycleCount(2);
        ft48.setAutoReverse(true);

        ft49.setCycleCount(2);
        ft49.setAutoReverse(true);

        ft50.setCycleCount(2);
        ft50.setAutoReverse(true);

        ft51.setCycleCount(2);
        ft51.setAutoReverse(true);

        ft52.setCycleCount(2);
        ft52.setAutoReverse(true);

        ft53.setCycleCount(2);
        ft53.setAutoReverse(true);

        ft54.setCycleCount(2);
        ft54.setAutoReverse(true);

        ft55.setCycleCount(2);
        ft55.setAutoReverse(true);

        ft56.setCycleCount(2);
        ft56.setAutoReverse(true);

        ft57.setCycleCount(2);
        ft57.setAutoReverse(true);

        ft58.setCycleCount(2);
        ft58.setAutoReverse(true);

        ft59.setCycleCount(2);
        ft59.setAutoReverse(true);

        ft60.setCycleCount(2);
        ft60.setAutoReverse(true);

        ft61.setCycleCount(2);
        ft61.setAutoReverse(true);

        loadChannel();
        MIDI_CHANNEL = 0;
    }

    public void initialize(URL url, ResourceBundle rb)
    {
        recordingName.setText("");
        recordTime.setText("");
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
//        System.out.println(mySettings.intCodetoChar(mySettings.buttonToCode[1]));
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                mySliderInt = (int) mySlider.getValue();
                OFFSET = 12 + 12*(mySliderInt);
                try {
                    loadChannel();
                } catch (InvalidMidiDataException | IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

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
        onStartButtonClick();
    }
    @FXML
    Label sequenceArea;
    @FXML
    Label sequenceArea1;
    @FXML
            Label personalLabel;
    @FXML
            Label globalLabel;

    int personalBest=0;
    String seq;
    String globalString;
    String FinalSeq;
    String FinalSeq1;

    int count=0;
    int len = 0;
    int score = 0;

    @FXML
    void onStartButtonClick()
    {
        count = 0;
        len = 0;
        score = 0;
//        System.out.println("Start Button Clicked");
        seq = SQL.getGameSequence(SelectGameController.id);
//        System.out.println("Sequence Retrieved");
        FinalSeq = "";
        FinalSeq1="";
        for(int i=0;i<seq.length();i++)
        {
            FinalSeq+=seq.charAt(i);
            if(seq.charAt(i)!=' ')
                len++;
        }
        sequenceArea.setText(FinalSeq);
        sequenceArea1.setText("");
        globalLabel.setText("");
        personalLabel.setText("");
    }

    @FXML
    private void handleKeyPressed(KeyEvent event)
    {
        String C = event.getText();
        if(C.charAt(0)==(FinalSeq.charAt(0)))
        {
            updateScore(true);
        }
        else
        {
            updateScore(false);
        }
    }

    private void updateScore(boolean flag)
    {
        if(flag)
        {
            score++;
        }
        count++;
        if(count==len)
        {
            double accuracy = score*100.0/len;
            sequenceArea.setText("Final Score: "+ score + '\n' + "Accuracy: "+ accuracy);
            sequenceArea1.setText("");
            personalBest= SQL.insertScore(SelectGameController.id,score);
            personalLabel.setText(String.valueOf("Personal Best: "+ personalBest));
            globalString = SQL.getGlobalMax(SelectGameController.id);
            globalLabel.setText("Global Best: "+globalString);
            count = 0;
            len = 0;
            score = 0;
            return;
        }
        if(FinalSeq.charAt(1) == ' ')
        {
            FinalSeq1 += FinalSeq.charAt(0);
            FinalSeq1 += FinalSeq.charAt(1);
            FinalSeq = FinalSeq.substring(2);
        }
        else
        {
            FinalSeq1 += FinalSeq.charAt(0);
            FinalSeq= FinalSeq.substring(1);
        }
//        sequenceArea.setText(FinalSeq);
        sequenceArea1.setText(FinalSeq1);
    }

}

