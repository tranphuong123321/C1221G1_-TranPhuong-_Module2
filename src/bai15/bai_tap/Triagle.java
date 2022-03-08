package bai_15.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triagle {
    private int a;
    private int b;
    private int c;
    public Triagle() {
    }

    public Triagle(int a, int b, int c) throws ExceptionRectangle  {
        if( a<=0 || b<=0 || c<=0 || (a+b)<c  || (b+c)<a || (c+a)<b ) {
            throw new ExceptionRectangle();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

}

