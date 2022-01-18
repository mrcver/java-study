public class Test01 {
    public static void main(String[] args) {
        Person p = new Person("zhan");

        change(p);
        System.out.println(p.name);
    }

    public static void change(Person p) {
        Person person = new Person("dada");
        p = person;
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}
