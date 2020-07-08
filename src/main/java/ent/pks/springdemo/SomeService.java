package ent.pks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

@Service
public class SomeService {
    private final Map<SomeEnum, SomeAdaptor> map;
    private SomeAdaptor someAdaptor;


    @Autowired
    public SomeService(List<SomeAdaptor> list) {
        this.map = list.stream().collect(toMap(SomeAdaptor::someEnum, identity()));
    }

    public void read(String name, String text) {
        someAdaptor = map.get(SomeEnum.valueOf(name));
        someAdaptor.someInterface().someMethod("yyy");
    }
}
