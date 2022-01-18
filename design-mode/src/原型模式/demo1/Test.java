package 原型模式.demo1;

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

        //date浅克隆情况下是引用，所以改了值以后全都改过来了
        date.setTime(123131321);

        System.out.println("=============================");
        System.out.println(a);
        System.out.println(b);
    }
}
