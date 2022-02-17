package com.sample.drools.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Person
 *
 * @author Aaric, created on 2022-02-17T10:36.
 * @version 0.5.0-SNAPSHOT
 */
@Data
@Accessors(chain = true)
public class Person {
    private String name;
    private Integer age;
}
