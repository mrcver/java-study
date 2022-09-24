package 原型模式.demo2;

import 原型模式.demo1.Prototype;

import java.util.Date;

public class TestDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        原型模式.demo1.Prototype a = new 原型模式.demo1.Prototype();
        a.setName("tim");
        a.setDate(new Date());

//        原型模式.demo1.Prototype b = (Prototype) a.clone();

    }
}
