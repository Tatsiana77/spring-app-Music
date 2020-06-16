package ru.tatchik.third;

import javafx.application.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer= context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer1.playMusic());
        boolean comparat = musicPlayer==musicPlayer1;
        System.out.println(comparat);
        context.close();

    }
}
