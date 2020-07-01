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
        System.out.println(someService.map.toString());
        someService.read("SECOND", "It is text");
        System.out.println("2");
    }
}
