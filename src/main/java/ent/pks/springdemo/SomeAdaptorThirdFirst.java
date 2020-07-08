package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeAdaptorThirdFirst implements SomeAdaptor {

    @Override
    public SomeEnum someEnum() {
        return SomeEnum.THIRD;
    }

    @Override
    public SomeInterface someInterface() {
        return new SomeInterfaceImplF();
    }
}
