package com.example.beadando.service;

import com.example.beadando.persistence.Subscription;
import com.example.beadando.persistence.SubscriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public void subscribe(String email, String city) {
        subscriptionRepository.save(new Subscription(email, city));
    }

    public boolean unsubscribe(String email) {
        if(subscriptionRepository.findById(email).isPresent()) {
            subscriptionRepository.deleteById(email);
            return true;
        }
        return false;
    }
}
