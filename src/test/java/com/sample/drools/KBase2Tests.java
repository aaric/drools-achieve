package com.sample.drools;

import com.sample.drools.pojo.Customer;
import com.sample.drools.pojo.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Arrays;

/**
 * KBase2Tests
 *
 * @author Aaric, created on 2022-02-14T10:06.
 * @version 0.3.0-SNAPSHOT
 */
@Slf4j
public class KBase2Tests {

    @Test
    public void testRule() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession();

        Order order = new Order();
        Customer customer = new Customer();
        customer.setName("张三");
        customer.setOrderList(Arrays.asList(order));
        session.insert(order);
        session.insert(customer);

        int count = session.fireAllRules();
//        int count = session.fireAllRules(new RuleNameEndsWithAgendaFilter("customer1"));
        session.dispose();

        log.info("fire {} rules", count);
    }
}
