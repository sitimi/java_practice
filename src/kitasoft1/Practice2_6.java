package kitasoft1;
import java.io.*;

public class Practice2_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		System.out.println("年齢を入力してください");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("生まれてからおおよそ" + (age * 365) + "日経過しています");
	}

}
