package ru.tatchik.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music {

    private List<String> rockList = new ArrayList<String>();

    {
        rockList.add(" Smells Like Teen Spirit");
        rockList.add("We Will Rock You ");
        rockList.add("Nothing Else Matters");
    }

    @Override
    public List<String> getSongs() {
        return rockList;
    }

}
