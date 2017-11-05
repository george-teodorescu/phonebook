package com.learn.springboot.repository;

import com.learn.springboot.model.Subscriber;
import org.springframework.data.repository.CrudRepository;

public interface SubscriberRepository extends CrudRepository<Subscriber, String> {
}
