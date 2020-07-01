package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeInterfaceImplF implements SomeInterface {
    @Override
    public SomeEnum someEnum() {
        return SomeEnum.FIRST;
    }

    @Override
    public void someMethod(String text) {
        System.out.println("someMethod FIRST " + text);
    }
}
