package com.sample.drools;

import com.sample.drools.pojo.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * KBase1Tests
 *
 * @author Aaric, created on 2022-01-21T11:02.
 * @version 0.2.0-SNAPSHOT
 */
@Slf4j
public class KBase1Tests {

    @Test
    public void testRule() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession();

        Order order = new Order()
                .setAmount(365);
        session.insert(order);

        int count = session.fireAllRules();
        session.dispose();

        log.info("fire {} rules, default score {}", count, order.getScore());
    }
}
