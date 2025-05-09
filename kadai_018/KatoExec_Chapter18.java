package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {
        // コンストラクタなしで子クラスのインスタンスを生成
        KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18();

        // 紹介を実行（名前のセットはインスタンス初期化ブロックで済んでいる）
        katoTaro.execIntroduce();
        katoIchiro.execIntroduce();
        katoHanako.execIntroduce();
    }
}