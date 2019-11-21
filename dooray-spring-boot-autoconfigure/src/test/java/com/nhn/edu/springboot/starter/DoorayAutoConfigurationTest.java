package com.nhn.edu.springboot.starter;

import com.nhn.dooray.client.DoorayHookSender;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jibumjung
 * @since
 */
public class DoorayAutoConfigurationTest {

    private ApplicationContextRunner applicationContextRunner
            = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(DoorayAutoConfiguration.class));

    @Test
    public void restTemplate() {
        applicationContextRunner
                .withPropertyValues("dooray.hook-url")
                .run(context -> assertThat(context).hasSingleBean(RestTemplate.class));
    }

    @Test
    public void noRestTemplateWithNoProperty() {
        applicationContextRunner
                .run(context -> assertThat(context).doesNotHaveBean(RestTemplate.class));
    }

    @Test
    public void doorayHookSender() {
        applicationContextRunner
                .withPropertyValues("dooray.hook-url")
                .run(context -> assertThat(context).hasSingleBean(DoorayHookSender.class));
    }
}