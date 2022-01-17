package base;

/**
 * 浅拷贝
 */
class ClonePerson implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public ClonePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ClonePerson() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/**
 * 深拷贝
 */
class MyBody {
    public MyHeader getHead() {
        return head;
    }

    private MyHeader head;

    public String getBody() {
        return body;
    }

    private String body;

    public MyBody(MyHeader head, String body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public MyBody clone() throws CloneNotSupportedException {
        MyBody newBody = (MyBody) super.clone();
        newBody.head = this.head.clone();
        return newBody;
    }
}

class MyHeader implements Cloneable {
    private String head;

    public MyHeader(String head) {
        this.head = head;
    }

    @Override
    public MyHeader clone() throws CloneNotSupportedException {
        return (MyHeader) super.clone();
    }
}

/**
 * clone 练习
 * @author tim
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonePerson p1 = new ClonePerson("xiaomi", 18);
        //浅拷贝
        ClonePerson p2 = (ClonePerson) p1.clone();
        ClonePerson p3 = p1;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        //深拷贝
        MyBody b1 = new MyBody(new MyHeader("header"), "body");
        System.out.println(b1);
        MyBody b2 = b1.clone();
        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1 == b2 : " + (b1.getHead() == b2.getHead()));
    }
}
