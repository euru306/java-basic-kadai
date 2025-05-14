package kadai_018;

public abstract class Kato_Chapter18 {

    public String familyName = "加藤"; // 姓
    public String givenName = "";  // 名
    public String address = "東京都中野区〇×"; // 住所（固定）

    // コンストラクタは削除（←指摘対応）
    
    // 共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    // 個別の紹介を出力する抽象メソッド（サブクラスで実装）
    public abstract void eachIntroduce();

    // 紹介を実行するメソッド
    public void execIntroduce() {
        this.commonIntroduce(); // 共通の紹介を出力
       this. eachIntroduce();   // 個別の紹介を出力（サブクラスで実装された内容）
       System.out.println();
    }

    // 親クラスから setGivenName() は削除（←指摘対応）
}
