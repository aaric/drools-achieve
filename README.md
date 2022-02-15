# drools-achieve

[![license](https://img.shields.io/badge/license-MIT-green.svg?style=flat&logo=github)](https://www.mit-license.org)
[![java](https://img.shields.io/badge/java-1.8u202-brightgreen.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![junit](https://img.shields.io/badge/junit-5.6.3-brightgreen.svg?style=flat&logo=junit5)](https://junit.org/junit5/docs/current/user-guide)
[![gradle](https://img.shields.io/badge/gradle-7.2-brightgreen.svg?style=flat&logo=gradle)](https://docs.gradle.org/7.2/userguide/installation.html)
[![spring boot](https://img.shields.io/badge/springboot-2.3.12.RELEASE-brightgreen.svg?style=flat&logo=springboot)](https://docs.spring.io/spring-boot/docs/2.3.12.RELEASE/reference/htmlsingle/)
[![release](https://img.shields.io/badge/release-0.4.0-blue.svg)](https://github.com/aaric/drools-achieve/releases)

> [Drools Learning.](https://docs.drools.org/7.64.0.Final/drools-docs/html_single/index.html)

## 1 Concept

|No.|Name| Remark   |
|:---:|:---:|----------|
|1|Working Memory|*工作内存*|
|2|Fact|*事实，即普通JavaBean写到Working Memory后的对象*|
|3|Rule Base|*规则库*|
|4|Pattern Matcher|*匹配器*|
|5|Agenda|*议程*|
|6|Execution Engine|*执行引擎*|


## 2 Workflow

![workflow](workflow.jpg)

## 3 Syntax

### 3.1 Condition

- contains
- not contains
- matches
- not matches
- memberOf
- not memberOf

### 3.2 Result

- insert
- update
- retract

### 3.3 Props

- salience (default 0)
- no-loop
- date-effective
- date-expires
- enabled
- dialect
- activation-group
- agenda-group
- auto-focus
- timer
