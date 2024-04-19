package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		count = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= count; i++) {
			System.out.print("*");
		}
		



	}

}
