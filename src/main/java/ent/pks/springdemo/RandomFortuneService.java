package ent.pks.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value(("${random.val01}"))
    String val01;
    @Value(("${random.val02}"))
    String val02;
    @Value(("${random.val03}"))
    String val03;

    List<String> randomString = new ArrayList<>();

    Random myRandom = new Random();


    @Override
    public String getFortune() {
        randomString.add(val01);
        randomString.add(val02);
        randomString.add(val03);
        return randomString.get(myRandom.nextInt(randomString.size()));
    }
}
