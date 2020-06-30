package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "SomeFortuneService";
    }
}
