package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int win = 0;
		int lose = 0;
		
		System.out.println("勝敗を10回入力してください"
				+ " 0：負け　1：勝ち");
		
		for(int i = 1; i <= 10; i++) {
			boolean judge;
			judge = Integer.parseInt(br.readLine()) == 0;
			if(judge) {
				lose++;
			}else {
				win++;
			}
			
		}
		System.out.println("勝ち：" + win + "回");
		System.out.println("負け：" + lose + "回");
		
	}

}
