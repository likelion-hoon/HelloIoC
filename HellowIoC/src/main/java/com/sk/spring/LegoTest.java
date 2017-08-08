package com.sk.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LegoTest {

   public static void main(String[] args) {

      GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("lego.xml");

      LegoBlock robot1 = (LegoBlock) ctx.getBean("head");
      robot1.run();

   }

}