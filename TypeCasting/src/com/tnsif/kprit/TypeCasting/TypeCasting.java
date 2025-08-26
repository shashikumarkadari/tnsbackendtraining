package com.tnsif.kprit.TypeCasting;

// TypeCasting : implicit (widening - small to big) and explicit (narrowing - big to small)
// byte -> short -> int -> long -> float -> double

public class TypeCasting {
    public static void main(String[] args) {
        
        // implicit (widening)
        short s = 100;       // short value
        int i = s;           // implicit casting (short -> int)
        long l = i;          // int -> long
        float f = l;         // long -> float
        double d = f;        // float -> double

        System.out.println("Implicit Casting (Widening):");
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);

        // explicit (narrowing)
        double d2 = 123.45;
        float f2 = (float) d2;   // double -> float
        long l2 = (long) f2;     // float -> long
        int i2 = (int) l2;       // long -> int
        short s2 = (short) i2;   // int -> short
        byte b2 = (byte) s2;     // short -> byte

        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("double value: " + d2);
        System.out.println("float value: " + f2);
        System.out.println("long value: " + l2);
        System.out.println("int value: " + i2);
        System.out.println("short value: " + s2);
        System.out.println("byte value: " + b2);
    }
}
