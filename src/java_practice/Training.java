package java_practice;

class Bmi{
    //インスタンス変数（メンバ変数）
    String name;

    //通常メソッド
    public double calcBmi(double height, double weight){
        height /= 100;
        double result = weight / Math.pow(height, 2);
        return result;
    }
}

//実行用クラス
class Training {
    //main()メソッド
    public static void main(String[] args){
        Bmi human1 = new Bmi(); //インスタンス化
	human1.name = "tanaka";
        System.out.println(human1.name); //インスタンス変数の呼び出し
        System.out.println(human1.calcBmi(170, 70)); //通常メソッドの呼び出し
    }
}