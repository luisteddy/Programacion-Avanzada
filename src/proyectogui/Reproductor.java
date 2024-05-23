/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author edgar
 */
public class Reproductor {
    
    private Clip clip;

    public void reproducir(String direcccion, float volumen) {

        try {
            InputStream inputStream = getClass().getResourceAsStream(direcccion);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(inputStream));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            
            if(volumen < 0.0f){
                volumen = 0.0f;
            }else if(volumen > 1.0f){
                volumen = 1.0f;
            }
            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float range = control.getMaximum() - control.getMinimum();
            float gain = (range * volumen) + control.getMinimum();
            control.setValue(gain);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    public void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}

