package ru.tatchik.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> musicList;
    private List<Music> musicList1;
    private List<Music> musicList2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") List<Music> musicList,
                       @Qualifier("classicalMusic") List<Music> musicList1,
                       @Qualifier("jazzMusic") List<Music> musicList2) {

        this.musicList = musicList;
        this.musicList1 = musicList1;
        this.musicList2 = musicList2;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs()
                + " with volume " + this.volume+", "+this.name;
    }
}

