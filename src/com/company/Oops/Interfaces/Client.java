package com.company.Oops.Interfaces;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.playASong();

        MusicSystem ms = new BoseMusicSystems();
        car.setMusicSystem(ms);

        car.playASong();
        car.pauseASong();

        ms = new SonyMusicSystem();
        car.setMusicSystem(ms);

        car.playASong();
        car.pauseASong();

    }
}
