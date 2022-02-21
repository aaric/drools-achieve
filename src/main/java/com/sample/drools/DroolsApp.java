package com.sample.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Drools 应用
 *
 * @author Aaric, created on 2022-02-21T11:23.
 * @version 0.6.0-SNAPSHOT
 */
@SpringBootApplication
public class DroolsApp {

    /**
     * 程序入口
     *
     * @param args 参数列表
     */
    public static void main(String[] args) {
        // 启动
        SpringApplication.run(DroolsApp.class, args);
    }
}
