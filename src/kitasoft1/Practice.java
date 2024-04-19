package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		
		int num = Integer.parseInt(br.readLine());
		
		for (i = 2; i <= (num / 2); i++) {
			if(num % i == 0) {
				break;
			}
			
		}
		if(i <= (num / 2)) {
			System.out.println(num + "は素数ではありません");
		}else {
			System.out.println(num + "は素数です");
		}

	}

}
