package org.example.service.impl;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class QuoteServiceImplTest {

    @Test
    void test() {
        QuoteServiceImpl quoteService = new QuoteServiceImpl(new RandomNumberGeneratorImpl());
        String quote = quoteService.getQuote();
        System.out.println(quote);
        assertNotNull(quote);
    }
}