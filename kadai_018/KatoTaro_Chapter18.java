package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    {
        // イニシャライザーブロックで名前をセット（コンストラクタなし）
        this.familyName = "加藤";
        this.givenName = "太郎";
    }

    // 個別の紹介を実装
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}
