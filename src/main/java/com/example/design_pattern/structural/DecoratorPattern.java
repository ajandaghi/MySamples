package com.example.design_pattern.structural;

public class DecoratorPattern {
    public static void main(String[] args) {
        MediaPlayer vLCPlayer = new VLCPlayer(new BasicMedialayer());
        vLCPlayer.assemble();
        System.out.println();

        MediaPlayer decoratedVLCPlayer = new VLCPlayer(new MP4Player(new BasicMedialayer()));
        decoratedVLCPlayer.assemble();
    }
}

interface MediaPlayer {
    public void assemble();
}

class BasicMedialayer implements MediaPlayer {
    @Override
    public void assemble() {
        System.out.println("Basic media player");
    }
}

 class MediaPlayerDecorator implements MediaPlayer {
    protected MediaPlayer mediaPlayer;

    public MediaPlayerDecorator(MediaPlayer mediaPlayer){
        this.mediaPlayer=mediaPlayer;
    }

    @Override
    public void assemble() {
        this.mediaPlayer.assemble();
    }
}

 class MP4Player extends MediaPlayerDecorator {
    public MP4Player(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding functionality to run MP4 files.");
    }
}

class VLCPlayer extends MediaPlayerDecorator {
    public VLCPlayer(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding functionality to run VLC files.");
    }
}