package Homework.Music;

public class ClassicMusic extends MusicStyle {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Classic music play " + name);
    }
}
