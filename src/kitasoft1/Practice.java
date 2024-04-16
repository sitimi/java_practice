package kitasoft1;
import java.io.*;


public class Practice {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		boolean judge;
		judge = (x >= 60 && y >= 60) || (x + y >= 130) || 
				(x + y >= 100 && (x  >= 90 || y >= 90));
		
		if(judge){
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		
		}
	
}
