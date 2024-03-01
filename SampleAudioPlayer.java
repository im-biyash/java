
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.applet.AudioClip;
import java.util.Timer;


public class SampleAydioPlayer extends Applet

{
     private Audioclip audioClip;
     private Button playButton, replayButton, stopButton;
     private Timer inactivityTimer;

     public void init() {
         audioClip = getAudioClip(getCodeBase(), "audiiofilename.wav");
         playButton = new Button("play");
         replayButton = new Button("replay");
         stopButton = new Button("stop");
         playButton.addActionListener(e -> playAudio());
         stopButton.addActionListener(e -> stopAudio());
         replayButton.addActionListener(e -> replayAudio());

         inactivityTimer = new Timer(5000, e -> stopAudio());
         inactivityTimer.setRepeats(false);

         setLayout(new FlowLayout());
         add(playButton);
         add(stopButton);
         add(replayButton);
     }
      private void playAudio() {
          if (audioClip != null) {
              audioClip.play();
              inactivityTimer.restart();

          }
      }
      private  void stopAudio(){
         if(audioClip!=null){
             audioClip.stop();

         }
         private void repeatAudio(){
             audioClip.stop();
             audioClip.start();
          }


     }

}
