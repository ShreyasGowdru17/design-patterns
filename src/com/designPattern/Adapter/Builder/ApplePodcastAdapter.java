package com.designPattern.Adapter.Builder;

public class ApplePodcastAdapter implements MediaPlayer{

    private AppleService appleService;

    public ApplePodcastAdapter(AppleService appleService) {
        this.appleService = appleService;
    }

    @Override
    public String play(String file) {
        return this.appleService.playEpisode(file);
    }

    @Override
    public String pause() {
        throw new RuntimeException("Apple Podcast does not support pause feature");
    }

    @Override
    public String stop() {
        return this.appleService.stopEpisode();
    }
}
