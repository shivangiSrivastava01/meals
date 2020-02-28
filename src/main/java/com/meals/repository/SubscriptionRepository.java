package com.meals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meals.domain.Subscription;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, String> {

}
