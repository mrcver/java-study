package 原型模式.demo2;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype a = new Prototype();
        a.setName("tim");
        Date date = new Date();
        a.setDate(date);

        Prototype b = (Prototype) a.clone();

        System.out.println(a);
        System.out.println(b);

        System.out.println("=============================");

        a.setName("tim2");
        date.setTime(1231231);

        System.out.println(a);
        System.out.println(b);
    }
}
