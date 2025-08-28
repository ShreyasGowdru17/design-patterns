package com.designPattern.Adapter.Builder;

public class PlayList {
    private String name;
    private boolean shuffle;
    private boolean repeat;
    private int maxSongs;

    public PlayList(Builder builder) {
        this.name = builder.name;
        this.shuffle = builder.shuffle;
        this.repeat = builder.repeat;
        this.maxSongs = builder.maxSongs;
    }
    public String getName() {
        return name;
    }
    public boolean isShuffle() {
        return shuffle;
    }
    public boolean isRepeat() {
        return repeat;
    }
    public int getMaxSongs() {
        return maxSongs;
    }
    public static class Builder{
        private String name;
        private boolean shuffle;
        private boolean repeat;
        private int maxSongs;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder shuffle(boolean shuffle){
            this.shuffle=shuffle;
            return this;
        }
        public Builder repeat(boolean repeat){
            this.repeat=repeat;
            return this;
        }
        public Builder maxSongs(int maxSongs){
            this.maxSongs=maxSongs;
            return this;
        }
        public PlayList build(){
            return new PlayList(this);
        }
    }
}
