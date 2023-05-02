package com.example.asynch;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tester {
    @Autowired
    AsyncClass asyncClass;

    @PostConstruct
    public void tester() throws InterruptedException {
        asyncClass.test(12).whenComplete((a,b)-> System.out.println(a+" "+b));
        System.out.println("finished");
    }


}
