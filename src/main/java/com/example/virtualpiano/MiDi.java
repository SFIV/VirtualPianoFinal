package com.example.virtualpiano;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class MiDi {
    public void NoteWithoutTransmitter() throws InvalidMidiDataException, MidiUnavailableException {
        // Sending a Message to a Receiver without using a Transmitter
        ShortMessage shortMessage = new ShortMessage();
        // Start Playing the note middle C (60),
        // Moderately loud (velocity = 100);
        shortMessage.setMessage(ShortMessage.NOTE_ON, 0, 60, 100);
        long timeStamp = -1;    // we'll just mention that its value can be set to -1 if you don't care about
        // specifying a precise time. In this case, the device receiving the message will try to respond to the
        // message as soon as possible.
        Receiver receiver = MidiSystem.getReceiver();
        receiver.send(shortMessage, timeStamp);
    }

    public void Connecting_to_SingleDevice() throws MidiUnavailableException {
        /*
        how to make the connection between the sequencer and the synthesizer. This will serve as an illustration of the
more general process of connecting one device's transmitter to another device's receiver
         */
        Sequencer sequencer;
        Transmitter seqTransmitter;
        Synthesizer synth;
        Receiver synthReceiver;

        sequencer = MidiSystem.getSequencer();
        seqTransmitter = sequencer.getTransmitter();
        synth = MidiSystem.getSynthesizer();
        synthReceiver = synth.getReceiver();
        seqTransmitter.setReceiver(synthReceiver);

    }

    public Sequencer obtaining_A_sequencer() throws MidiUnavailableException{
        // Obtaining a Sequencer
        Sequencer sequencer = MidiSystem.getSequencer();
        if(sequencer == null) {
            System.out.println("Sequencer Device is not supported");
            return null;
        }
        else
            sequencer.open();
        return sequencer;
    }

    public void loading_A_sequence (Sequencer sequencer) throws InvalidMidiDataException, IOException {
        File myMidiFile = new File("src/main/resources/UEFA-ChampionsLeague.mid");

        // Construct a Sequence object, and load it into my sequencer.

        Sequence mySeq = MidiSystem.getSequence(myMidiFile);
        sequencer.setSequence(mySeq);
        // Loading a sequence object into a Sequencer to play the sequence
    }

    public void play_Sequence (Sequencer sequencer) {
        sequencer.start();
    }

    public void close_Sequence (Sequencer sequencer) throws InterruptedException {
//        Thread.sleep(5000);
        sequencer.stop();
        sequencer.close();
    }

    // Recording and Saving Sequence
    public Sequencer start_Recording () throws MidiUnavailableException, InvalidMidiDataException {
        Sequencer sequencer = obtaining_A_sequencer();
//        sequencer.open();

        /*
Set up the "wiring" of the MIDI connections. The object that is transmitting the MIDI data to
be recorded should be configured, through its setReceiver method, to send data to a Receiver associated
with the recording Sequencer.
         */
        // Obtain a Transmitter object and set its Receiver to the recording Sequencer's Receiver
        Transmitter transmitter = MidiSystem.getTransmitter();
        Receiver receiver = sequencer.getReceiver();
        transmitter.setReceiver(receiver);

        /*
            Create A sequence object which will store the recorded data, When you create the Sequence object,
            you must specify the global timing information for the sequence

            The constructor for Sequence takes as arguments a divisionType and a timing Resolution.
            The divisionType argument specifies the units of the resolution argument. In this case, we have
            specified that the timing resolution of the Sequence we're creating will be 10 pulses per quarter note.

            An additional optional argument to the Sequence constructor is a number of tracks argument,
            which would cause the initial sequence to begin with the specified number of (initially empty) Tracks.
            Otherwise, the Sequence will be created with no initial Tracks; they can be added later as needed
            */

        Sequence sequence = new Sequence(Sequence.PPQ, 24);


/*
            Create an empty Track in the Sequence, with Sequence.createTrack. This step is unnecessary
            if the Sequence was created with initial Tracks
*/
        Track track = sequence.createTrack();

/*
Using Sequencer.setSequence, select our new Sequence to receive the recording. The setSequence method ties
together an existing Sequence with the Sequencer, which is somewhat analogous to loading a tape onto a tape recorder.
 */
        sequencer.setSequence(sequence);

/*  Invoke Sequencer.recordEnable for each Track to be recorded. If necessary, get a reference to the available tracks
    in the sequence by invoking Sequence.getTracks()
 */
        sequencer.recordEnable(track, -1);

        /*  Invoke startRecording on the Sequencer.   */
        sequencer.startRecording();

        return sequencer;
    }

    public void stop_Recording(Sequencer sequencer) throws IOException {
        sequencer.stopRecording();

/*  Save the recorded Sequence to a MIDI file with MidiSystem.write. The write method of
    MidiSystem takes a Sequence as one of its arguments, and will write that Sequence to a stream or file.
 */
//        MidiSystem.write(sequencer.getSequence(), MidiSystem.getMidiFileTypes()[1], new File("test.mid"));
        MidiSystem.write(sequencer.getSequence(), 0, new File("test.mid"));
    }
}
