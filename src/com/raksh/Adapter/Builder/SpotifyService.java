package com.raksh.Adapter.Builder;

public class SpotifyService implements Spotify {
    private String name;
    private boolean shuffle;
    private boolean repeat;
    private int maxSongs;

    public SpotifyService(PlayList playList) {
        this.name=playList.getName();
        this.shuffle=playList.isShuffle();
        this.repeat=playList.isRepeat();
        this.maxSongs=playList.getMaxSongs();
    }

    public SpotifyService() {
    }

    @Override
    public String spotifyPlaySong(String fileName) {
        return "Playing Spotify song"+" "+fileName+"now";
    }
    @Override
    public String spotifyStopSong() {
        return "Stopped Playing Spotify song";
    }
}
