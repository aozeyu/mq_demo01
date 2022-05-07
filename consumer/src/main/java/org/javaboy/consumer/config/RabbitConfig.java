package org.javaboy.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @program: mq_demo01
 * @description: 2222
 * @packagename: org.javaboy.consumer.config
 * @author: 姚泽宇
 * @date: 2022-05-07 09:36
 **/
@Configuration
public class RabbitConfig {
    public static final String QUEUE_NAME = "hello_world_queue_name";
    @Bean
    Queue javaboyQueue() {
        return new Queue(QUEUE_NAME, true, false, false);
    }
}
