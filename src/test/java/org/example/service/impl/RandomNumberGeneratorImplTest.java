package org.example.service.impl;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Tag("unit")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RandomNumberGeneratorImplTest {

    @Test
    void test() {
        RandomNumberGeneratorImpl randomNumberGenerator = new RandomNumberGeneratorImpl();
        Integer randomNumber = randomNumberGenerator.getRandomNumber(0, 10);
        assertNotNull(randomNumber);
        Assertions.assertTrue(randomNumber <= 10);
        Assertions.assertTrue(randomNumber >= 0);
    }

}