package com.liang.Adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdaper mediaAdaper;

    @Override
    public void play(String audioType, String fileName) {

        //播放mp3音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") ||
                    audioType.equalsIgnoreCase("mp4")) {
            mediaAdaper = new MediaAdaper(audioType);
            mediaAdaper.play(audioType, fileName);
        } else {
            System.out.println("Invalid media." + audioType + "format not supported");
        }
    }
}
