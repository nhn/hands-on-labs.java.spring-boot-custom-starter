package com.nhn.edu.springboot.starter;

import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * TODO (2)
 * 1) DoorayHookSender.class 가 Classpath 에 존재할때,
 * 2) dooray.hook-url 속성이 정의되어 있을때,
 * 설정 내용이 동작하도록 수정 하세요.
 */

/**
 * TODO (2)
 * 1) DoorayHookSender.classがClasspathに存在するとき,
 * 2) dooray.hook-url の属性が定義されているとき,
 * 設定内容が動作するように修正してください。
 */

@Configuration
@ConditionalOnClass()
@ConditionalOnProperty("")
@EnableConfigurationProperties(DoorayProperties.class)
public class DoorayAutoConfiguration {

    /**
     * TODO (3) RestTemplate type 의 빈이 선언되어 있지 않으면 RestTemplate Bean을 생성하도록 @ConditionalOnMissingBean 을 이용해서 코드를 작성하세요.
     * TODO (3) RestTemplate typeのウィーンが宣言されていないとRestTemplate Beanを生成するように @ConditionalOnMissingBeanを利用してコードを作成してください。
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * TODO (4) DoorayHookSender Bean 이 생성되도록 코드를 작성해 주세요. DoorayHookSender 생성자의 두번째 인자는 doorayProperties.getHookUrl() 입니다.
     * TODO (4) DoorayHookSender Beanが生成されるようにコードを作成してください。 DoorayHookSender二番目の引数は、doorayProperties.getHookUrl() です。
     */
    @Bean
    public DoorayHookSender doorayHookSender(RestTemplate restTemplate, DoorayProperties doorayProperties) {
        return new DoorayHookSender(null, null);
    }


}
