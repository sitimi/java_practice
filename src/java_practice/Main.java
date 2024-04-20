package java_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 入力パラメータを読み込む
		String input = br.readLine();
		String[] param = input.split(" ");//入力値を空白で分解する
		
		
		int sum = Integer.parseInt(param[0]);
	

		for(int i = 0; i < param.length - 1; i += 2) {
			
			int num2 = Integer.parseInt(param[i + 2]);
			String operator = param[i + 1];
			
			if(operator.equals("+")) {
				sum += num2;
			}else {
				sum -= num2;
			}

		}
		System.out.println(sum);

	}

}
