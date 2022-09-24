package 原型模式.demo2;

import java.util.Date;

/**
 * 深克隆
 */
public class Prototype implements Cloneable {
    private String name;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    /**
     * 深克隆实现，把date属性也克隆一下
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();

        Prototype a = (Prototype) o;
        a.date = (Date) this.date.clone();
        return a;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
