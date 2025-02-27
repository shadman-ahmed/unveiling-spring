package org.example;

import org.example.service.QuoteService;
import org.example.service.impl.QuoteServiceImpl;
import org.example.service.impl.RandomNumberGeneratorImpl;


public class Main {
    public static void main(String[] args) {
        QuoteService quoteService = new QuoteServiceImpl(new RandomNumberGeneratorImpl());
        String quoteOfTheDay = quoteService.getQuote();
        System.out.println("\n\n===> Quote of day: " + quoteOfTheDay + " <===");
    }
}