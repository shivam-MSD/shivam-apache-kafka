package com.enduser.config;

import com.enduser.constant.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

//    @Bean
    @KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME,groupId = AppConstant.GROUP_ID)
    public void updateLocation(String value)
    {
        System.out.println("location :- " + value);
    }
}
