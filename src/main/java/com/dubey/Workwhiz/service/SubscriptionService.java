package com.dubey.Workwhiz.service;

import com.dubey.Workwhiz.modal.PlanType;
import com.dubey.Workwhiz.modal.Subscription;
import com.dubey.Workwhiz.modal.User;

public interface SubscriptionService {
Subscription createSubscription(User user);
Subscription getUsersSubscription(Long userId)throws Exception;
Subscription upgradeSubscription(Long userId, PlanType planType);
boolean isValid(Subscription subscription);
}
