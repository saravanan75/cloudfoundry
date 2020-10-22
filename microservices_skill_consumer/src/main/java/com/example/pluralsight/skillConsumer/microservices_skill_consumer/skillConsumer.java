package com.example.pluralsight.skillConsumer.microservices_skill_consumer;


import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

@Configuration
@EnableRabbit
@RabbitListener(queues = "skillQueue")
public class skillConsumer {
   @RabbitHandler
    public void onReceive(@Payload String msg) {
       System.out.println("#####");
       System.out.println("Skill Published " + msg);
    }
}
