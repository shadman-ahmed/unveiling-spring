package org.example.service.impl;

import org.example.service.RandomNumberGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator {
    @Override
    public Integer getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
