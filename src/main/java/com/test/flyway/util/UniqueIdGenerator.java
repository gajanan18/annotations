package com.test.flyway.util;

import java.security.SecureRandom;
import java.util.Random;

public class UniqueIdGenerator {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static final String NUMBER = "0123456789";

    private static final Random random = new SecureRandom();

    private UniqueIdGenerator() {
        throw new AssertionError();
    }

    public static String generateRandomUid() {
        StringBuilder sb = new StringBuilder();
        int length = 12;
        while (length > 0) {
            length--;
            if (length == 3 || length == 7 || length == 10) {
                sb.append(NUMBER.charAt(random.nextInt(NUMBER.length())));
            } else {
                sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
            }
        }
        return sb.toString();
    }
}
