package com.example.chapter2;

public class    FunctionsPractice {
    public static double average(int a,int b,int c)
    {
         return (a+b+c)/3.0;
    }
    public static void main(String[] args)
    {
        int a = 65;
        int b = 5;
        int c = 78;
        double avg=(a+b+c)/3.0;
        System.out.println(avg);
        System.out.println(average(1,2,3));
        Classex d=new Classex();
        d.method1();
        Classex2 e=new Classex2();
        e.method1();
        e.method2();
    }
}
