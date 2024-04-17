package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int score1 = 0;
		int score2 = 0;

		for (int i = 1; i <= 9; i++) {

			System.err.println(i + "回表、巨人の得点は？");
			score1 += Integer.parseInt(br.readLine());

			System.err.println(i + "回裏、阪神の得点は？");
			score2 += Integer.parseInt(br.readLine());
		}

		System.out.println("巨人：" + score1 + "点、阪神：" + score2 + "点");
		if (score1 == score2) {
			System.out.println("引き分け");
		} else if (score1 > score2) {
			System.out.println("巨人の勝ち");
		} else {
			System.out.println("阪神の勝ち");
		}

	}

}
