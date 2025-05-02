package kadai_015;

public class Car_Chapter15 {

    // フィールド（内部データ）
    private int gear; // ギア
    private int speed; // スピード

    // コンストラクタ
    public Car_Chapter15(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        if (afterGear < 1 || afterGear > 5) {
            System.out.println("エラー：ギアは1から5の範囲で指定してください");
            return;
        }
        this.gear = afterGear;
        this.speed = calculateSpeed(afterGear);
    }

    // スピード計算メソッド
    private int calculateSpeed(int gear) {
        return gear * 10;
    }

    // 現在のスピードを取得するメソッド
    public int getSpeed() {
        return this.speed;
    }
}