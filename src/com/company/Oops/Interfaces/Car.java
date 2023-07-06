package com.company.Oops.Interfaces;

public class Car {
    private MusicSystem ms;
    public void setMusicSystem(MusicSystem obj){
        ms = obj;
    }

    void startCar(){}

    void applybreaks(){}

    private boolean handleNoMusicSystemPlugged(){
        if(ms==null){
            System.out.println("No music system installed");
            return false;
        }
        return true;
    }

    void playASong(){
        if(handleNoMusicSystemPlugged()) ms.play();
    }

    void pauseASong(){
        if(handleNoMusicSystemPlugged()) ms.pause();
    }

    void forwardTheSong(int duration){
        if(handleNoMusicSystemPlugged()) ms.forward(duration);
    }

    void rewindTheSong(int duration){
        if(handleNoMusicSystemPlugged()) ms.rewind(duration);
    }

    void setVolumeOfSong(int level){
        if(handleNoMusicSystemPlugged()) ms.setvalues(level);
    }
}
