package kitasoft1;
import java.io.*;


public class Practice {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		if(x >= 80){
			System.out.println("たいへんよくできました。");
		}else if(x >= 60){
			System.out.println("よくできました。");
		}else {
			System.out.println("ざんねんでした。");
		}
		
		
		
		}
	
}
