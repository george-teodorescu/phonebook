package com.learn.springboot.service;

import com.learn.springboot.model.Subscriber;
import com.learn.springboot.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    public List<Subscriber> getAllSubscribers() {
        List<Subscriber> list = new ArrayList<>();
        subscriberRepository.findAll().forEach(list::add);
        return list;
    }

    public Subscriber getSubscriber(String cnp) {
        return subscriberRepository.findOne(cnp);
    }

    public void addSubscriber(Subscriber subscriber) {
        subscriberRepository.save(subscriber);
    }

    public void updateSubscriber(String cnp, Subscriber subscriber) {
        subscriberRepository.save(subscriber);
    }

    public void deleteSubscriber(String cnp) {
        subscriberRepository.delete(cnp);
    }
}