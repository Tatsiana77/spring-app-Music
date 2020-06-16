package ru.tatchik.third;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
@Component
@Scope("prototype")
public class JazzMusic implements Music {
    List<String> jazzList = new ArrayList<>();

    {
        jazzList.add("Take five");
        jazzList.add("Hello, Dolly!");
        jazzList.add("Summertime");
    }

    @Override
    public List<String> getSongs() {
        return jazzList;
    }

}



