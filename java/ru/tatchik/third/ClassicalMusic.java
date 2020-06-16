package ru.tatchik.third;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();

    {
        classicalList.add("Dance of the Knights");
        classicalList.add("Лунная соната");
        classicalList.add("Фантазия-экспромт до-диез минор");

    }

    @Override
    public List<String> getSongs() {
        return classicalList;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
