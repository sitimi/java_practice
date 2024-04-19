package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max_num = 0;
		int min_num = 0;

		System.out.println("整数を１０回入力してください");
		for (int i = 1; i <= 10; i++) {
			int x = Integer.parseInt(br.readLine());
			if (max_num < x) {
				max_num = x;
			}else if(min_num > x){
				min_num = x;
			}
			
		}
		System.out.println(max_num);
		System.out.println(min_num);


	}

}
