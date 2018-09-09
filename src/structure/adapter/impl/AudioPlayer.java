package structure.adapter.impl;

import structure.adapter.MediaPlayer;

public class AudioPlayer  implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        // 播放 Mp3音乐的内置支持
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else  if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }

    }
}
