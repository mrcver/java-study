package 建造者模式;

public class Worker extends Builder {

    private House house;

    public Worker() {
        house = new House();
    }


    @Override
    void buildA() {
        house.setA("a");
    }

    @Override
    void buildB() {
        house.setB("b");
    }

    @Override
    void buildC() {
        house.setC("c");
    }

    @Override
    House getHouse() {
        return house;
    }
}
