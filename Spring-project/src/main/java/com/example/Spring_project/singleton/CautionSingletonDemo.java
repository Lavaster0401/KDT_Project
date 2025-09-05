package com.example.Spring_project.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CautionSingletonDemo {
    public static void main(String[] args) {
        var ac = new AnnotationConfigApplicationContext(CautionConfiguration.class);
        var sc1 = ac.getBean("singletonCautionService", SingletonCautionService.class);
        var sc2 = ac.getBean("singletonCautionService", SingletonCautionService.class);

        System.out.println("[DEMO] 같은 빈? " + (sc1 == sc2)); // true

        int a = sc1.order(1000); // A 사용자의 주문
        int b = sc2.order(2000); // B 사용자의 주문(같은 빈 인스턴스에 덮어씀)

        System.out.println(a +" "+ b);
    }
}
