package com.ponomarev.virtual.thread.app.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple rest controller with a test method
 * @author Egor Ponomarev
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public void test() {
        log.info("Rest controller method has been called {}", Thread.currentThread());
    }
}
