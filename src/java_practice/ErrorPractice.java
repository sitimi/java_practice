package java_practice;

public class ErrorPractice {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("a / b =" + (a / b) + "余り" + (a % b));
		}catch (NumberFormatException e) {
			System.out.println("数値を入力してください");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("割る数は０以上を入力してください");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}finally {
			System.out.println("プログラムを修了します");
		}
		
		
	}

}
