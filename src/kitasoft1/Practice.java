package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nums[] = new int[10];
		int avg = 0;

		System.out.println("数字を１０回入力してください");
		for (int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(br.readLine());

		}
		
		for (int num : nums) {
			avg += num;
		}
		System.out.println("平均値は" + (avg / nums.length));
	}

}
