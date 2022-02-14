package com.sample.drools.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Customer
 *
 * @author Aaric, created on 2022-02-14T09:51.
 * @version 0.3.0-SNAPSHOT
 */
@Data
@Accessors(chain = true)
public class Customer {
    private String name;
    private List<Order> orderList;
}
