 package Practice;

import java.util.Scanner;

class CV151Q3 {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    void m1(){
        System.out.println("Hi");
    }
    static CV151Q3 m2(){
        return new CV151Q3();
    }

    public static void main(String[] args) {
        CV151Q3 x = m2();
        System.out.println(x.a);
        System.out.println(x.a);
        System.out.println(x.a);
        System.out.println(x.a);
        System.out.println(x.a);
        x.m1();
    }
}
