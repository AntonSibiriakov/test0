package pl.sibiriakov.test;

public class MusicPlayer {
    private Music music;
    public MusicPlayer(Music music){;
    this.music = music;
    }
    public void playMusic(){
        System.out.println("pl"+music.getSond());


    }
}