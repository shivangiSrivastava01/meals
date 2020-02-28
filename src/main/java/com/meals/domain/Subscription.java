package com.meals.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Subscription {
	@Id
	private String subscriptionId;
	private Date endDate;
	private Date startDate;
	private int mealId;
	private SubscriptionType type;
	private String userId;
}
