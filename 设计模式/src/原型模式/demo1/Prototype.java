package 原型模式.demo1;

import java.util.Date;

/**
 * 浅克隆
 */
public class Prototype implements Cloneable {
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Prototype() {
    }

    public Prototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
