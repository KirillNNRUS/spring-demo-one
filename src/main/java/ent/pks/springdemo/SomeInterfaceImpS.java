package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeInterfaceImpS implements SomeInterface {
    @Override
    public SomeEnum someEnum() {
        return SomeEnum.SECOND;
    }

    @Override
    public void someMethod(String text) {
        System.out.println("someMethod SECOND " + text);
    }
}
