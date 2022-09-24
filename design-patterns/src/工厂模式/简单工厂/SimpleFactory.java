package 工厂模式.简单工厂;

public class SimpleFactory {
    public static Car getCar(String name) {
        if ("wuling".equals(name)) {
            return new WulingCar();
        } else {
            return new FuteCar();
        }
    }
}
