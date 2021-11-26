package com.nhn.edu.springboot.starter.application;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    /**
     * TODO (9)
     * DoorayHookSender 타입의 doorayHookSender 클래스 변수를 선언하고 @Autowire 한다.
     */
     private DoorayHookSender doorayHookSender;

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
            DoorayHook doorayHook = new DoorayHook("이름을 입력하세요.", null, "메시지를 입력하세요.", null);
        };
    }
}
