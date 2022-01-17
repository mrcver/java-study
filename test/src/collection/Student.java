package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * collection 集合set练习
 */
public class Student {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    private String id;

    private String name;

    /**
     * 泛型set，无序
     */
    private Set<Course> courses;

    private Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    /**
     * 添加课程
     *
     * @param id   课程id
     * @param name 课程名称
     */
    private void courseAdd(String id, String name) {
        Course c = new Course(id, name);
        this.courses.add(c);
    }

    /**
     * 入口方法
     *
     * @param args 无需传参
     */
    public static void main(String[] args) {
        Student s = new Student("1", "小明");
        s.courseAdd("1", "php");
        s.courseAdd("2", "java");

        for (Course c : s.courses) {
            System.out.println(c.id + '-' + c.name);
        }
    }
}
