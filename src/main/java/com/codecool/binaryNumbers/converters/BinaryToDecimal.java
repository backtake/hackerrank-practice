package com.codecool.binaryNumbers.converters;

public class BinaryToDecimal {

    public int getDecimalOutOfBinary(String binaryNumber) {
        int decimalNumber = 0;
        int size = binaryNumber.toCharArray().length;
        for (int i=0; i < size; i++) {
            decimalNumber += Character.getNumericValue(binaryNumber.charAt(size - i - 1)) * Math.pow(2, i);
        }

        return decimalNumber;
    }
}
