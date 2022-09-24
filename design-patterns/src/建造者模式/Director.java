package 建造者模式;

public class Director {
    public House build() {
        Worker worker = new Worker();
        worker.buildA();
        worker.buildB();
        worker.buildC();

        return worker.getHouse();
    }
}
