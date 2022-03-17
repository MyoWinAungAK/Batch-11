package com.century.calculator;

public class Lesson8 {
    public static void main(String[] args) {

      /*  int a = 45;
        a=a+ 34;

        a+= 34;

        a++; // Postfix
        a--;
        --a; // Prefix
        ++a;

       */

        int b =24;
        b=++b;
        System.out.println(b);

        int number1 = 23;
        int number2 = 78;
        int f = (number1>number2)?number1:number2;
        System.out.println(f);
        //(condition)?true:false;

        /*
        int num = 20 << 2;
        int num1 = 15 << 4;
        System.out.println(num);
        System.out.println(num1);

        int num2 = 10 >> 2;
        System.out.println(num2);

        int num3 = 20 >> 2;
        System.out.println(num3);
        int num4 = 20 >>3;
        System.out.println(num4); */

    }
}
// Right Shift
// 20>>2
// 10100
// 00101
// 20/ 2^2 = 5

// 20>>3
// 10100
// 00010
// 20 / 2^3 = 2

// Lest Shift

//20 << 2
// 1010000
// 6543210
// 2^6=64
// 2^4=16
// 80

// 15 << 4
// 11110000
// 2^7 =128
// 2^6 =64
// 2^5 =32
// 2^4 =16
// 240

/**
 *Unary Operator
 * Arithmetic
 *
 * Relational Operator
 * Bitwise Operator
 * Logical Operator
 * shift Operator
 *
 * Ternary
 * Assignment = += -= *= /= %= &= |= <<= >>= >>>=
 */

// Unary Operator
// Binary Operator
// Ternary Operator

//( << Left shift )
//( >>  right shift )
//( >>> right shift 0 fill)