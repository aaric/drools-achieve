package com.sample.drools;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * KBase5Tests
 *
 * @author Aaric, created on 2022-02-17T10:03.
 * @version 0.5.0-SNAPSHOT
 */
@Slf4j
public class KBase5Tests {

    @Test
    public void testRule() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession();

        List<String> list = new ArrayList<>();
        session.setGlobal("gList", list);

        int count = session.fireAllRules();
        session.dispose();

        log.info("fire {} rules", count);
    }
}
