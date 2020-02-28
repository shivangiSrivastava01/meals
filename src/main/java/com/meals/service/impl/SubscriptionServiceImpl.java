package com.meals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.domain.Subscription;
import com.meals.repository.SubscriptionRepository;
import com.meals.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	SubscriptionRepository subscriptionRepository;

	@Override
	public Subscription getSubscription(String id) {
		Optional<Subscription> subscription = subscriptionRepository.findById(id);
		return subscription.isPresent() ? subscription.get() : null;
	}

	@Override
	public List<Subscription> getAllSubscriptions() {
		return (List<Subscription>) subscriptionRepository.findAll();
	}

	@Override
	public boolean addSubscription(List<Subscription> subscriptions) {
		for (Subscription subscription : subscriptions) {
			subscriptionRepository.save(subscription);
		}
		return true;
	}

	@Override
	public boolean modifySubscription(Subscription subscription) {
		subscriptionRepository.save(subscription);
		return true;
	}

	@Override
	public boolean cancelSubscription(List<String> subscriptionIds) {
		for (String subscriptionId : subscriptionIds) {
			subscriptionRepository.deleteById(subscriptionId);
		}
		return true;
	}

}