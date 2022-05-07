package org.javaboy.consumer.receiver;

import org.javaboy.consumer.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: mq_demo01
 * @description: 2222
 * @packagename: org.javaboy.consumer.receiver
 * @author: 姚泽宇
 * @date: 2022-05-07 09:42
 **/
@Component
public class MsgReceiver {
    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void handleMsg(String msg){
        System.out.println("msg = " + msg);
    }
}
