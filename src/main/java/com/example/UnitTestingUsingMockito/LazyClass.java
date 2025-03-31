package com.example.UnitTestingUsingMockito;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class LazyClass {

    @PostConstruct
    public void init() {
        System.out.println("initialized the Lazy class bean");
    }

    public void shout(){
        System.out.println("shout called!!!!");
    }
}
