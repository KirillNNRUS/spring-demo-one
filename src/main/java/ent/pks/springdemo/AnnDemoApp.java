package ent.pks.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Coach coach = context.getBean("tennisCoach", Coach.class);
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getFortuneService());
//        context.close();

        SomeService someService = context.getBean("someService", SomeService.class);
        someService.read("THIRD", "It is text");
    }
}
