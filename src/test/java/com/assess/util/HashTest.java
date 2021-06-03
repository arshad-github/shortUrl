package com.assess.util;

import org.junit.Test;

import static com.assess.controller.ShortUrlControllerTest.LONG_ADDRESS;
import static org.junit.Assert.assertEquals;

public class HashTest {

    private static final String HASHED = "31404988";

    @Test
    public void validHash() {
        assertEquals(HASHED, Hash.getHash(LONG_ADDRESS));
    }

}