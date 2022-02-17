package com.tsn;

public class PrimitiveDataTypesClass {
    public static void main(String[] args) {

    }

    public static void additionOfDifferentDataTypes() {
        byte aByte = 10;
        short aShort = 100;
        int aInt = 1000;
        long aLong = 100000L;
        char aChar = ' ';

        System.out.println(aByte + aShort + aInt + aLong + aChar);
    }

    public static void subtractionOfDifferentDataTypes() {
        byte aByte = 10;
        short aShort = 100;
        int aInt = 1000;
        long aLong = 100000L;

        System.out.println(aLong - aInt - aShort - aByte);
    }

    public static void OtherOperations() {
        byte aByte = 15;
        short aShort = 100;
        int aInt = 1000;
        long aLong = 100000L;

        System.out.println(aLong * aByte);
        System.out.println(aInt / ++aShort);
        System.out.println(aInt % aByte);
    }

    public static void Overflow() {
        int aInt = 1000;
        long aLong = 100000L;
        byte aByte = aInt + aLong;

        System.out.println(aByte);
    }

    public static void NegativeOverflow() {
        int aInt = 1000;
        long aLong = -100000L;
        byte aByte = aInt + aLong;

        System.out.println(aByte);
    }

    public static void ComparativeAndLogicOperators() {
        int x = 1000;
        int y = 999;

        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x < (y + 2));
        System.out.println(x <= (y + 2));
        System.out.println((y + 1) == x);
        System.out.println((y + 1) != x);
        System.out.println((x > y) && (x <= (y + 2)));
        System.out.println(((y + 1) == x) || (x <= (y + 2)));
    }
}
