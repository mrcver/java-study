package 建造者模式;

public abstract class Builder {
    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract House getHouse();
}
