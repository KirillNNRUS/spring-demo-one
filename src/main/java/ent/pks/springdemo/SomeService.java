package ent.pks.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

@Service
public class SomeService {
    private final Map<SomeEnum, SomeInterface> map;
    private SomeInterface someInterface;

    @Autowired
    public SomeService(List<SomeInterface> list) {
        this.map = list.stream().collect(toMap(SomeInterface::someEnum, identity()));
    }

    public void read(String name, String text) {
        someInterface = map.get(SomeEnum.valueOf(name));
        someInterface.someMethod(text);
    }
}
