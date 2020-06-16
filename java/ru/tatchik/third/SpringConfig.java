package ru.tatchik.third;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.tatchik.third")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
//    @Bean
//    @Scope("prototype")
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
////    @Scope("prototype")
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
////    @Scope("prototype")
//    public JazzMusic jazzMusic() { return new JazzMusic(); }
//
//    @Bean
////    @Scope("prototype")
//    public List<Music> musicList() { return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic()); }
//
//    @Bean
//    @Scope("prototype")
//    public MusicPlayer musicPlayer() { return new MusicPlayer(musicList(),musicList1(),musicList2()); }

//    @Bean
//   @Scope("prototype")
//    public Computer computer() { return new Computer(musicPlayer());
    //}
}


