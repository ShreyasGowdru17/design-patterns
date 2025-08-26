package com.raksh.Adapter.Builder;

public class MediaPlayerDirector {
    private String player;
    public static void director(String player) {
        if(player.equalsIgnoreCase("spotify")){
            new SpotifyAdapter(new SpotifyService());
        }else if (player.equalsIgnoreCase("apple podcast")){
            new ApplePodcastAdapter(new AppleService());
        }else{
            new YoutubeAdapter(new YoutubeService());
        }
    }
}
