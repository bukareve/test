package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;



public class Main {


    static byte b = 8;
    static short sh = 16;
    static int in = 32;
    static long lg = 64;

    static float fl = 2.6f;
    static double db = 2.6;

    static boolean bool = true;

    static String st ="blya";
    static char c = 'e';

    static int CONST = 55;
    static final int CONST2 = 88;

    public static void main(String[] args) {
	// write your code here
        System.out.print("byte " + b);
        System.out.println("short " + sh);
        System.out.println("int " + in);
        System.out.println("long " + lg);

        System.out.println("float " + fl);
        System.out.println("double " + db);

        System.out.println("boolean " + bool);

        System.out.println("string " + st);
        System.out.println("char " + c);

        System.out.println("final " + CONST);
        //CONST = 88;
        System.out.println("not final " + CONST2);
    }
}
