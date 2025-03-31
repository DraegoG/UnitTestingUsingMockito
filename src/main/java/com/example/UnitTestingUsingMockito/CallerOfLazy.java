package com.example.UnitTestingUsingMockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CallerOfLazy {

    @Autowired
    @Lazy
    private LazyClass lazyClass;


    public void callLazy(){
        lazyClass.shout();
    }
}
