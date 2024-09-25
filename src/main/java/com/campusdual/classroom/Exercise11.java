package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        redRemote.turnOn();
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println(redRemote.getColor());
        redRemote.turnOff();
        System.out.println(blackRemote.getColor());
    }

}