package com.example.asynch;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncClass {

    @Async
    public CompletableFuture<Integer> test(Integer num) throws InterruptedException {
        Thread.sleep(5000);
        return CompletableFuture.completedFuture(num+1);
    }
}
