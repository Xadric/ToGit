package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run3();
    }

    private void run3() {
        String name="box";
        double prise = 5.90;
        System.out.printf("%s 's prise is %.2f",name,prise);
    }

    private void run2() {
        String name="box";
        double prise = 5.90;
        System.out.printf("%s 's prise is %.2f",name,prise);
    }

    private void run1() {
        int k1 = 7;
        int k2 = 7;
        System.out.printf("It is %d apples in %d box",k2,k1);
    }

    private void run() {
        System.out.println("Hello world!");
    }
}