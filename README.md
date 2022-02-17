# drools-achieve

[![License](https://img.shields.io/badge/License-MIT-important.svg?style=flat&logo=github)](https://www.mit-license.org)
[![JDK](https://img.shields.io/badge/JDK-1.8-success.svg?style=flat&logo=java)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![JUnit](https://img.shields.io/badge/JUnit-5.6.3-success.svg?style=flat&logo=junit5)](https://junit.org/junit5/docs/current/user-guide)
[![Gradle](https://img.shields.io/badge/Gradle-7.2-success.svg?style=flat&logo=gradle)](https://docs.gradle.org/7.2/userguide/installation.html)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.3.12.RELEASE-success.svg?style=flat&logo=springboot)](https://docs.spring.io/spring-boot/docs/2.3.12.RELEASE/reference/htmlsingle/)
[![Release](https://img.shields.io/badge/Release-0.5.0-informational.svg)](https://github.com/aaric/drools-achieve/releases)

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
- no-loop (default false)
- date-effective
- date-expires
- enabled (default true)
- dialect
- activation-group
- agenda-group
- auto-focus (default false)
- timer

### 3.4 Advanced

- package
- import
- global
- query
- function
- rule end
