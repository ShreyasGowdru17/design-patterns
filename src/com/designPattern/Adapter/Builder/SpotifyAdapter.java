package com.raksh.Adapter.Builder;

public class SpotifyAdapter implements MediaPlayer{
    private SpotifyService spotifyService;
    public SpotifyAdapter(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public String play(String file) {
        return this.spotifyService.spotifyPlaySong(file);
    }


    @Override
    public String pause() {
        throw new RuntimeException("Spotify doesn't support pause ");
    }
    @Override
    public String stop() {
        return this.spotifyService.spotifyStopSong();
    }
}
