package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 备选课程类
 * list
 */
public class ListTest {
    /**
     * 往备选课程中添加课程
     */
    public static void main(String[] args) {
        List<Course> coursesToSelect = new ArrayList<>();

        Course cr1 = new Course("1", "php");
        coursesToSelect.add(cr1);
        Course temp = coursesToSelect.get(0);
        System.out.println(temp.id + "-" + temp.name);

        Course cr2 = new Course("2", "java");
        coursesToSelect.add(cr2);
        temp = coursesToSelect.get(0);
        System.out.println(temp.id + "-" + temp.name);
        temp = coursesToSelect.get(1);
        System.out.println(temp.id + "-" + temp.name);
    }
}
