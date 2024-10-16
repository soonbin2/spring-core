package com.ohgiraffers.section03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* ComponentScan :
 *  basePackage로 설정 된 하위 경로에 특정 어노테이션을 가지고 있는 클래스를 bean으로 등록하는 기능이다.
 *  basePackage를 설정하지 않으면 기본적으로 설정 파일과 동일한 패키지에 있는 bean만 탐색한다.
 *  @Component 어노테이션이 작성된 클래스를 인식하여 bean으로 등록한다.
 *  특수 목적에 따라 세부 기능을 제공하는 @Controller, @Service, @Repository, @Configuration 등을 사용한다.
 * */
@Configuration
@ComponentScan(basePackages = "com.ohgiraffers")
public class ContextConfiguration {
}
