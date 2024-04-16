package kitasoft1;
import java.io.*;


public class Practice {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		if(x >= 80){
			System.out.println("優");
		}else if(x >= 70){
			System.out.println("良");
		}else if(x >= 60){
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
		
		
		}
	
}
