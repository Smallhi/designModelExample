package structure.adapter;

import structure.adapter.impl.AudioPlayer;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("map3","Hero.mp3");
        audioPlayer.play("mp4","Hero.mp4");
        audioPlayer.play("vlc","far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
