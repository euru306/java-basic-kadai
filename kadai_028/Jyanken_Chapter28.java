package kadai_028;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分の手を入力
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.print("じゃんけんの手を入力してください（r: グー, s: チョキ, p: パー）：");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
                break;
            } else {
                System.out.println("エラー：r、s、pのいずれかを入力してください。");
            }
        }

        return choice;
    }

    // 対戦相手の手をランダムで選ぶ
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        Random rand = new Random();
        int index = rand.nextInt(hands.length);
        return hands[index];
    }

    // 勝敗判定と出力
    public void playGame(String myChoice, String opponentChoice) {
        // じゃんけんの手を表示するための辞書
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 手の表示
        System.out.println("あなたの手: " + handMap.get(myChoice));
        System.out.println("相手の手: " + handMap.get(opponentChoice));

        // 勝敗の比較
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです！");
        } else if ((myChoice.equals("r") && opponentChoice.equals("s")) ||
                   (myChoice.equals("s") && opponentChoice.equals("p")) ||
                   (myChoice.equals("p") && opponentChoice.equals("r"))) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです。");
        }
    }
}
