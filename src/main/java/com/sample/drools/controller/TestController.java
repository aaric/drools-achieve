package com.sample.drools.controller;

import com.sample.drools.pojo.Order;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Aaric, created on 2022-02-21T14:17.
 * @version 0.6.0-SNAPSHOT
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private KieBase kieBase;

    @GetMapping("/getScore")
    public Integer getScore(@RequestParam Integer amount) {
        KieSession kieSession = kieBase.newKieSession();

        Order order = new Order().setAmount(amount);
        kieSession.insert(order);

        int count = kieSession.fireAllRules();
        kieSession.dispose();

        log.info("fire {} rules", count);

        return order.getScore();
    }
}
