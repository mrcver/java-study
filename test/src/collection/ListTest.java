package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 备选课程类
 * list
 */
public class ListTest {
    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    /**
     * 往备选课程中添加课程
     */
    public void testAdd() {
        Course cr1 = new Course("1", "php");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println(temp.id + "-" + temp.name);

        Course cr2 = new Course("2", "java");
        coursesToSelect.add(2, cr2);
        temp = (Course) coursesToSelect.get(0);
        System.out.println(temp.id + "-" + temp.name);
        temp = (Course) coursesToSelect.get(1);
        System.out.println(temp.id + "-" + temp.name);
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
    }
}
