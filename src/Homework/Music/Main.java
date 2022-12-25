package Homework.Music;

public class Main {
    public static void main(String[] args) {


        MusicStyle[] musicStyles = {
                new RockMusic("Rammstein"),
                new PopMusic("Zeit"),
                new ClassicMusic("Mozart"),
        };
        for (MusicStyle musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
