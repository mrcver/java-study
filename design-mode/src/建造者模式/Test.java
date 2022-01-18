package 建造者模式;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        House house = director.build();
        System.out.println(house);
    }
}
