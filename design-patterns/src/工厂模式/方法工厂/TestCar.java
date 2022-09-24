package 工厂模式.方法工厂;

//实现起来比较复杂，比simple代码量多
public class TestCar {
    public static void main(String[] args) {
        Car wuling = new WulingCar();
        System.out.println(wuling.getName());

        Car fute = new FuteCar();
        System.out.println(fute.getName());
    }
}
