package com.company.Oops.Interfaces;

public class SonyMusicSystem implements MusicSystem{
    @Override
    public void play() {
        System.out.println("Sony logic of playing a song");
    }

    @Override
    public void pause() {
        System.out.println("Sony logic of pause a song");
    }

    @Override
    public void forward(int duration) {
        System.out.println("Sony logic of fowarding a song");
    }

    @Override
    public void rewind(int duration) {
        System.out.println("Sony logic of rewinding a song");
    }

    @Override
    public void setvalues(int levels) {
        System.out.println("Sony logic of setting volume");
    }
}
