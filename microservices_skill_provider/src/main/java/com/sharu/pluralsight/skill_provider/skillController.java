package com.sharu.pluralsight.skill_provider;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class skillController {
    @Autowired
    private RabbitTemplate template;

    @RequestMapping(value = "/publishSkill", method = RequestMethod.GET)
    public void publishSkill(@RequestParam String msg) {
        template.convertAndSend("skillQueue", msg);
    }
}
