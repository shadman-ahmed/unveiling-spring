package org.example.config;

import org.example.service.QuoteService;
import org.example.service.impl.QuoteServiceImpl;
import org.example.service.impl.RandomNumberGeneratorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public QuoteService quoteService() {
        return new QuoteServiceImpl(new RandomNumberGeneratorImpl());
    }
}
