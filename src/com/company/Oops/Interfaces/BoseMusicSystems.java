package com.company.Oops.Interfaces;

public class BoseMusicSystems implements MusicSystem{

    @Override
    public void play() {
        System.out.println("Bose logic of playing a song");
    }

    @Override
    public void pause() {
        System.out.println("Bose logic of pause a song");
    }

    @Override
    public void forward(int duration) {
        System.out.println("Bose logic of fowarding a song");
    }

    @Override
    public void rewind(int duration) {
        System.out.println("Bose logic of rewinding a song");
    }

    @Override
    public void setvalues(int levels) {
        System.out.println("Bose logic of setting volume");
    }
}
