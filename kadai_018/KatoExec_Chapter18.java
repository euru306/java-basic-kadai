package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {
        // 各子クラスのインスタンスを作成
        KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18("加藤");
        KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18("加藤");
        KatoHanako_Chapter18 katoHanako = new KatoHanako_Chapter18("加藤");

        // 名をセット
        katoTaro.setGivenName();
        katoIchiro.setGivenName();
        katoHanako.setGivenName();

        // 紹介を実行
       
        katoTaro.execIntroduce();
        
      
        katoIchiro.execIntroduce();
        
        
        katoHanako.execIntroduce();
    }
}
