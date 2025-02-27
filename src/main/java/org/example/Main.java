package org.example;

import org.example.service.QuoteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

        QuoteService quoteService = applicationContext.getBean("quoteService", QuoteService.class);

        String quoteOfTheDay = quoteService.getQuote();

        System.out.println("\n\n===> Quote of day: " + quoteOfTheDay + " <===");
    }
}