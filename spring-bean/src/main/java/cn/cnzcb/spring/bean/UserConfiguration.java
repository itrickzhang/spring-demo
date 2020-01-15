package cn.cnzcb.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public UserAnnotation userAnnotation(){
        UserAnnotation userAnnotation = new UserAnnotation();
        userAnnotation.setId("11");
        userAnnotation.setName("java圈");
        return userAnnotation;
    }
}
