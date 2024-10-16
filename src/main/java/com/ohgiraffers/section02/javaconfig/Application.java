package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        /* AnnotationConfigApplicationContext클래스를 사용하여 ApplicationContext를 생성한다.
         *  생성자에 @Configuration 어노테이션이 달린 설정 클래스의 메타 정보를 전달한다.
         * */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO memberDTO = context.getBean("member", MemberDTO.class);
        System.out.println("memberDTO = " + memberDTO);
    }
}