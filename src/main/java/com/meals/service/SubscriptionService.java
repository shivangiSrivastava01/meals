package com.meals.service;

import java.util.List;

import com.meals.domain.Subscription;

public interface SubscriptionService {

	public Subscription getSubscription(String id);

	public List<Subscription> getAllSubscriptions();

	public boolean addSubscription(List<Subscription> subscription);

	public boolean modifySubscription(Subscription subscription);

	public boolean cancelSubscription(List<String> subscriptionIdList);

}