package Homework.Music;

public abstract class MusicStyle {

    String name;

    public MusicStyle(String name) {

        this.name = name;
    }
    public abstract void playMusic();
}
