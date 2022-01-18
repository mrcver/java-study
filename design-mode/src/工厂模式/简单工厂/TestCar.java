package 工厂模式.简单工厂;

//方便调用
public class TestCar {
    public static void main(String[] args) {
        Car wuling = SimpleFactory.getCar("wuling");
        System.out.println(wuling.getName());

        Car fute = SimpleFactory.getCar("");
        System.out.println(fute.getName());
    }
}
