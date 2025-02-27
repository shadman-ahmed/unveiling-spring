package org.example;

import org.example.service.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        QuoteService quoteService = context.getBean(QuoteService.class);
        String quoteOfTheDay = quoteService.getQuote();

        System.out.println("\n\n===> Quote of day: " + quoteOfTheDay + " <===");
    }
}