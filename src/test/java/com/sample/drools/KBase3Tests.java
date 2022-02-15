package com.sample.drools;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * KBase3Tests
 *
 * @author Aaric, created on 2022-02-15T10:37.
 * @version 0.4.0-SNAPSHOT
 */
@Slf4j
public class KBase3Tests {

    static {
        System.setProperty("drools.dateformat", "yyyy-MM-dd");
    }

    @Test
    public void testRule() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession();

        // agenda-group "agenda"
//        session.getAgenda().getAgendaGroup("agenda").setFocus();

        int count = session.fireAllRules();
        session.dispose();

        log.info("fire {} rules", count);
    }
}
