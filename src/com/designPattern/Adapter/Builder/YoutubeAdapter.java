package com.designPattern.Adapter.Builder;

public class YoutubeAdapter implements MediaPlayer{
    private YoutubeService youtubeService;

    public YoutubeAdapter(YoutubeService youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public String play(String file) {
        return this.youtubeService.youtubePlayVideo(file);
    }

    @Override
    public String pause() {
        return this.youtubeService.youtubePauseVideo();
    }

    @Override
    public String stop() {
        return this.youtubeService.youtubeStopVideo();
    }
}
