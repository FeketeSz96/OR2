package com.example.beadando.controller;

import com.example.beadando.controller.model.SubscriptionModel;
import com.example.beadando.controller.model.UnsubscribeModel;
import com.example.beadando.service.SubscriptionService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
    private final SubscriptionService service;

    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscribe")
    public String subscribe(@ModelAttribute SubscriptionModel subscription) {
        service.subscribe(subscription.getEmail(), subscription.getCity());
        return "LOL nope csak eltároltam hol laksz";
    }

    @PostMapping("/unsubscribe")
    public String unsubscribe(@ModelAttribute UnsubscribeModel unsubscribe) {
        if(service.unsubscribe(unsubscribe.getEmail())) {
            return "Jó töröltem bocsi";
        }
        return "Nem is volt meg ez a cím";
    }
}
