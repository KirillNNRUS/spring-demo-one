package ent.pks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PoloCoach implements Coach {

    private FortuneService fortuneService;

    public PoloCoach() {
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Polo Coach";
    }

    @Override
    public String getFortuneService() {
        return fortuneService.getFortune();
    }
}
