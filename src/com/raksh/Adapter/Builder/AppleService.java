package com.raksh.Adapter.Builder;

public class AppleService implements Apple{

    private String name;
    private boolean shuffle;
    private boolean repeat;
    private int maxSongs;

    public AppleService(PlayList playList) {
        this.name=playList.getName();
        this.shuffle=playList.isShuffle();
        this.repeat=playList.isRepeat();
        this.maxSongs=playList.getMaxSongs();
    }

    public AppleService() {
    }
    @Override
    public String playEpisode(String fileType) {
        return "Playing ApplePodcast"+fileType+""+"Now";
    }

    @Override
    public String stopEpisode() {
        return "Stopping ApplePodcast Now";
    }
}
