package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeInterfaceImplS implements SomeInterface {
    @Override
    public void someMethod(String text) {
        System.out.println("SomeInterfaceImplS print" + " " +text);
    }
}
