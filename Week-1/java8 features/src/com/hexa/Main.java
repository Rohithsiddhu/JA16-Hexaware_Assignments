package com.hexa;

public class Main {
public static void main(String[] anrgs)
{
	MyInterface m=(int a,int b)->{return a+b;}; //lambda expression
    System.out.println(m.add(2,3));
}
}
