package kadai_015;

public class CarExec_Chapter15 {

    public static void main(String[] args) {
        System.out.println("Start");
        Car_Chapter15 car = new Car_Chapter15(1, 10);
        car.gearChange(3); // 引数3
        System.out.println("ギアを変更しました。現在の速度: " + car.getSpeed() + " km/h");
        System.out.println("End");
    }
}