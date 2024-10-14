package ru.evgeniychurakov.java.basic.homeworks;

import java.util.Arrays;

public class ArrayProcessor {

    public static int[] elementsAfterLastOne(int[] array) {
        int lastIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                lastIndex = i;
            }
        }

        if (lastIndex == -1) {
            throw new RuntimeException("Array does not contain 1");
        }

        return Arrays.copyOfRange(array, lastIndex + 1, array.length);
    }

    public static boolean isValidArray(int[] array) {
        boolean hasOne = false;
        boolean hasTwo = false;

        for (int num : array) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 2) {
                hasTwo = true;
            } else {
                return false;
            }
        }

        return hasOne && hasTwo;
    }
}