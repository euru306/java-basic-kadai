package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    public KatoTaro_Chapter18(String familyName) {
        super(familyName); // 親クラスのコンストラクタを呼び出す
    }

    // 名をセットするメソッド
    @Override
    public void setGivenName() {
        this.givenName = "太郎";
    }

    // 個別の紹介を実装
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}
