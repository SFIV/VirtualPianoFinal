package com.example.virtualpiano;

import javafx.scene.chart.PieChart;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class audioRecorder {

    public static TargetDataLine targetLine;
    public static String fileName = new String();
   public static void start()
   {
        try{
            AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, false);
            DataLine.Info dataInfo = new DataLine.Info(TargetDataLine.class, audioFormat);

            if(!AudioSystem.isLineSupported(dataInfo))
            {
                System.out.println("Not supported");
            }

            targetLine = (TargetDataLine) AudioSystem.getLine(dataInfo);
            targetLine.open();

            targetLine.start();

            Thread audioRecorderThread = new Thread()
            {
                @Override public void run()
                {
                    AudioInputStream recordingStream = new AudioInputStream(targetLine);
                    System.out.println("Started recording");
                    fileName = mySettings.generateCurrentDateTime() + ".wav";
                    File outputFile = new File(mySettings.folderPath,fileName);
                    try
                    {
                        AudioSystem.write(recordingStream, AudioFileFormat.Type.WAVE, outputFile);
                    }
                    catch (IOException ex)
                    {
                        System.out.println(ex);
                    }
                    System.out.println("Stopped recording");
                }
            };

            audioRecorderThread.start();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
   }
   public static void stop()
   {
       targetLine.stop();
       targetLine.close();
   }
}