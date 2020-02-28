package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meals.domain.Subscription;
import com.meals.service.SubscriptionService;

@RestController
public class SubscriptionController {
	@Autowired
	SubscriptionService subscriptionService;

	@GetMapping(value = "/subscription")
	public Subscription getSubscription(@RequestParam("") String id) {
		return subscriptionService.getSubscription(id);
	}

	@GetMapping(value = "/subscriptions")
	public List<Subscription> getAllSubscriptions() {
		return subscriptionService.getAllSubscriptions();
	}

	@PostMapping(value = "/subscribe")
	public boolean addSubscription(@RequestBody List<Subscription> subscription) {
		return subscriptionService.addSubscription(subscription);
	}

	@PostMapping(value = "/subscription/edit")
	public boolean modifySubscription(@RequestBody Subscription subscription) {
		return subscriptionService.modifySubscription(subscription);
	}

	@DeleteMapping(value = "/subscription")
	public boolean cancelSubscription(@RequestBody List<String> Ids) {
		return subscriptionService.cancelSubscription(Ids);
	}
}
