package ent.pks.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SomeAdaptorFirstFirst implements SomeAdaptor {

    @Override
    public SomeEnum someEnum() {
        return SomeEnum.FIRST;
    }

    @Override
    public SomeInterface someInterface() {
        return new SomeInterfaceImplF();
    }
}
