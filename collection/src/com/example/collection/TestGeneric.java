package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型集合使用
 */
public class TestGeneric {
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();
    }

    public void testAdd() {
        Course cr1 = new Course("1", "php");
        courses.add(cr1);
    }

    /**
     * 循环遍历
     */
    public void foreach() {
        for (Course cr : courses) {
            System.out.println(cr.id + '-' + cr.name);
        }
    }

    public static void main(String[] args) {
        TestGeneric tg = new TestGeneric();
        tg.testAdd();
        tg.foreach();
    }
}
