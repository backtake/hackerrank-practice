package com.codecool.binaryNumbers.converters;

public class NumberToBinary {

    public String getBinaryOutOfDecimal(int number) {
        StringBuilder binaryNumber = new StringBuilder();
        while (number > 0) {
            binaryNumber.append(String.valueOf(number%2));
            number = number / 2;
        }

        return binaryNumber.reverse().toString();
    }
}