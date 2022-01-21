package com.sample.drools.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Order
 *
 * @author Aaric, created on 2022-01-21T11:37.
 * @version 0.2.0-SNAPSHOT
 */
@Data
@Accessors(chain = true)
public class Order {
    private int amount;
    private int score;
}
