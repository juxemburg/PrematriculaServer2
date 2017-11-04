package com.aliance.util;

public class TextUtil {

    public String sanitize(String textToSanitize) {
        return textToSanitize.replaceAll("\\s", " ");
    }
}
