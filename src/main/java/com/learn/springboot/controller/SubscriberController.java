package com.learn.springboot.controller;


import com.learn.springboot.model.Subscriber;
import com.learn.springboot.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @RequestMapping("/subscribers")
    public List<Subscriber> getAllSubscribers() {
        return subscriberService.getAllSubscribers();
    }

    @RequestMapping("/subscribers/{cnp}")
    public Subscriber getSubscriber(@PathVariable String cnp) {
        return subscriberService.getSubscriber(cnp);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subscribers")
    public void addSubscriber(@RequestBody Subscriber subscriber) {
        subscriberService.addSubscriber(subscriber);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subscribers/{cnp}")
    public void updateSubscriber(@RequestBody Subscriber subscriber, @PathVariable String cnp) {
        subscriberService.updateSubscriber(cnp, subscriber);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subscribers/{cnp}")
    public void deleteSubscriber(@PathVariable String cnp) {
        subscriberService.deleteSubscriber(cnp);
    }
}
