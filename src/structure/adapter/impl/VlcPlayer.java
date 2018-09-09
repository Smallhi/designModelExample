package structure.adapter.impl;

import structure.adapter.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing...
    }
}
