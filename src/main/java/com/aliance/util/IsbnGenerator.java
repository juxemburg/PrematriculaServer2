package com.aliance.util;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {

    @Override
    public String generateNumber() {
        return "15-5677-"+Math.abs(new Random().nextInt());
    }
}