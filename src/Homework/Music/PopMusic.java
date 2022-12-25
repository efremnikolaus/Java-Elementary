package Homework.Music;

public class PopMusic extends MusicStyle {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Pop music play " + name);

    }
}
