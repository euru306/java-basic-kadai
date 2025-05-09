package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    {
        // イニシャライザーブロックで初期化（コンストラクタは使わない）
        this.familyName = "加藤";
        this.givenName = "一郎";
    }

    // 個別の紹介を実装
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
