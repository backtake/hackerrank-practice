package com.codecool.binaryNumbers.binaryGap;


import com.codecool.binaryNumbers.converters.NumberToBinary;

public class BinaryGap {

    NumberToBinary numberToBinary;

    public int solution(int N) {
        numberToBinary = new NumberToBinary();
        String binaryNumber = numberToBinary.getBinaryOutOfDecimal(N);
        int result = countZeroes(binaryNumber);
        System.out.println(binaryNumber);
        return result;
    }

    private int countZeroes(String binaryNumber) {
        int sizeOfGap = 0;
        int biggestGap = 0;

        for (int i=0;i<binaryNumber.length();i++){
            if(binaryNumber.charAt(i)=='0') {
                sizeOfGap++;
            } else if (binaryNumber.charAt(i)!='0'){
                if(sizeOfGap>biggestGap) {
                    biggestGap = sizeOfGap;
                }
                sizeOfGap = 0;
            }
        }

        return biggestGap;
    }
}