package com.ponomarev.virtual.thread.app.configuration;

import com.ponomarev.virtual.thread.app.executor.AsyncTaskExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Configuration of app
 * @author Egor Ponomarev
 */
@EnableScheduling
@EnableAsync
@Configuration
public class AppConfiguration implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AsyncTaskExecutorService asyncTaskExecutorService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        asyncTaskExecutorService.run();
    }
}
