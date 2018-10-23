package com.nhnent.edu.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    /**
     * TODO (9)
     * DoorayHookSender 를 Autowire 한다.
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    /**
     * TODO (10)
     * ApplicationReady 일때!, DoorayHookSender 로 Hook 을 발송한다.
     */
    @Bean
    public ApplicationListener<ApplicationReadyEvent> applicationListener() {
        return (event) -> {
        };
    }
}
