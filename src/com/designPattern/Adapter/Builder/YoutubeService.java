package com.designPattern.Adapter.Builder;

public class YoutubeService implements Youtube {
    private String name;
    private boolean shuffle;
    private boolean repeat;
    private int maxSongs;

    public YoutubeService(PlayList playList) {
        this.name=playList.getName();
        this.shuffle=playList.isShuffle();
        this.repeat=playList.isRepeat();
        this.maxSongs=playList.getMaxSongs();
    }

    public YoutubeService() {
    }
    @Override
    public String youtubePlayVideo(String fileType) {
        return "Playing"+""+fileType+"now";
    }

    @Override
    public String youtubePauseVideo() {
        return "Pausing Youtube Video";
    }

    @Override
    public String youtubeStopVideo() {
        return "Stoping Youtube video";
    }
}
