package org.example.service.impl;

import org.example.service.QuoteService;
import org.example.service.RandomNumberGenerator;

import java.util.List;

public class QuoteServiceImpl implements QuoteService {
    private final List<String> quotes;
    private final RandomNumberGenerator randomNumberGenerator;

    public QuoteServiceImpl(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
        quotes = List.of(
                "Believe you can and you're halfway there. – Theodore Roosevelt",
                "Do what you can, with what you have, where you are. – Theodore Roosevelt",
                "It always seems impossible until it’s done. – Nelson Mandela",
                "Act as if what you do makes a difference. It does. – William James",
                "Keep your face always toward the sunshine—and shadows will fall behind you. – Walt Whitman",
                "The only way to do great work is to love what you do. – Steve Jobs",
                "Success is not the key to happiness. Happiness is the key to success. – Albert Schweitzer",
                "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt",
                "Do not watch the clock. Do what it does. Keep going. – Sam Levenson",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky",
                "Start where you are. Use what you have. Do what you can. – Arthur Ashe",
                "Don't watch the clock; do what it does. Keep going. – Sam Levenson"
        );
    }

    @Override
    public String getQuote() {
        Integer randomNumber = randomNumberGenerator.getRandomNumber(0, quotes.size() - 1);
        return quotes.get(randomNumber);
    }
}
