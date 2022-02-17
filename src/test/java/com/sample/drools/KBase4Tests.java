package com.sample.drools;

import com.sample.drools.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import java.util.ArrayList;
import java.util.List;

/**
 * KBase4Tests
 *
 * @author Aaric, created on 2022-02-17T10:03.
 * @version 0.5.0-SNAPSHOT
 */
@Slf4j
public class KBase4Tests {

    @Test
    public void testRule() {
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession();

        List<String> list = new ArrayList<>();
        session.setGlobal("gList", list);

        session.insert(new Person().setName("张三").setAge(24));
        session.insert(new Person().setName("李四").setAge(30));
        session.insert(new Person().setName("王五").setAge(35));

        int count = session.fireAllRules();

        QueryResults results = session.getQueryResults("query1");
        for (QueryResultsRow resultsRow : results) {
            Person person = (Person) resultsRow.get("$person");
            log.info("{}", person);
        }

        results = session.getQueryResults("query2", "李四");
        for (QueryResultsRow resultsRow : results) {
            Person person = (Person) resultsRow.get("$person");
            log.info("{}", person);
        }

        session.dispose();

        log.info("fire {} rules", count);
    }
}
