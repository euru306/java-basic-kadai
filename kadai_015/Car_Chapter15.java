package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int newGear) {
		int oldGear = gear;
		gear = newGear;
		
		if (gear >= 1&& gear <= 5) {
		speed = gear * 10; // ギア × 10 で速度計算
		} else {
			speed = 10; // 無効なギアは10km/h固定
		}
		System.out.println("ギアが " + oldGear + " から " + gear + " に変わりました。");
		System.out.println("速度は時速 " + speed + "kmです。");
	}
		
		public void run() {
		    System.out.println("速度は時速" + speed + "kmです");
		}
	
}