package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigmacTestSuite {

    @Test
    void shouldCreateBigmac() {
        //given
        //when
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunType.SESAME)
                .sauce(SauceType.BARBECUE)
                .burgers(1)
                .ingredient(IngredientType.LETTUCE)
                .ingredient(IngredientType.CHEESE)
                .ingredient(IngredientType.ONION)
                .build();
        //then
        assertEquals(1, bigmac.getBurgers());
        System.out.println(bigmac);
    }
}
