package src.com.xiaoluo.m5.staticdemon;

public class RacingCar {
    static int num;
    RacingCar() {
        num++;
    }
    static void showNum() {
        System.out.println("Car Num:" + num);
    }
    public static void main(String[] args) {
        RacingCar car1,car2,car3;

        car1 = new RacingCar();
        RacingCar.showNum();

        car2 = new RacingCar();
        car3 = new RacingCar();
        RacingCar.showNum();
    }
}
