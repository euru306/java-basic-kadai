package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {
    	this.givenName = "花子";
    }

    // 個別の紹介を実装
    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}
