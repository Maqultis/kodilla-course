package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {



    @Test
    void testBigmacBuilder() {
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients(Ingredients.ONION)
                .ingredients(Ingredients.CUCUMBER)
                .sauce(Sauce.STANDARD)
                .bun(Bun.WITH_SESAME)
                .burgers(2)
                .ingredients(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);
        //when
        int ingredientsSize = bigmac.getIngredients().size();

        //then
        assertEquals(3, ingredientsSize);
        assertTrue(bigmac.getIngredients().contains(Ingredients.ONION));
        assertFalse(bigmac.getIngredients().contains(Ingredients.BACON));
        assertEquals(2, bigmac.getBurgers());
    }

    @Test
    void testIllegalStateException() {
        //given
        IllegalStateException exception = null;
        Bigmac bigmac = null;
        //when
        try {
            bigmac = new Bigmac.BigmacBuilder()
                    .ingredients(Ingredients.CUCUMBER)
                    .sauce(Sauce.STANDARD)
                    .bun(Bun.WITH_SESAME)
                    .burgers(4)
                    .ingredients(Ingredients.CHEESE)
                    .build();
        } catch (IllegalStateException e) {
            exception = e;
        }

        //then
        assertNotNull(exception);
        assertEquals("Only 1 to 3 burgers are allowed.", exception.getMessage());
        System.out.println(exception.getMessage());
    }
}
