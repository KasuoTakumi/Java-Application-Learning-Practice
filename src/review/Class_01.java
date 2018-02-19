/*
 * 入出力 演算 条件分岐 ループ
*/

package review;
import java.util.Scanner;


public class Class_01 {

	public static void Output() {//文字列の出力

		System.out.println("Hello World");
		System.out.print("Good");
		System.out.println(" Bye");
		System.out.println("Have a nice day");

	}

	public static void Imput() {//文字列の入力

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please any numbers");
		int numbers = sc.nextInt();
		System.out.println("Imput number ⇒" + numbers);

	}

	public static void Argument (String message1, String message2, String message3) {//引数

		//引数
		System.out.print(message1);
		System.out.println(message2);
		System.out.println(message3);

	}

	public static void Calculation(int num1, int num2, double num3) {//引数を使った計算

		num3 = num1 + num2;
		System.out.println(num1 +"+"+ num2 +"=" + num3);//足し算

		num3 = num1 - num2;
		System.out.println(num1 +"-"+ num2 +"=" + num3);//引き算

		num3 = num1 * num2;
		System.out.println(num1 +"*"+ num2 +"=" + num3);//掛け算

		num3 = num1 / num2;
		System.out.println(num1 +"/"+ num2 +"=" + num3);//割り算

		num3 = num1 % num2;
		System.out.println(num1 +"%"+ num2 +"=" + num3);//あまり

	}

	public static void If_Statement(int num1, int num2) {//IF分による条件分岐

		if(num1 > num2) {
			System.out.println("num1 > num2");
		}else {
			System.out.println("num1 < num2");
		}
	}

	public static void For_Loop() {//For分によるループ
		for(int i=1; i<=10; i++) {
			System.out.println("Loop count:" + i);
		}
	}

	public static void While_Loop() {//Whileによるループ
		int i = 1;
		while(i <= 5) {
			System.out.println("i = " + i);
			i++;
		}
	}

	public static void main(String[] args) {

		Output();
		System.out.println("");

		Imput();
		System.out.println("");

		Argument("Hello", "World", "GoodBye");
		System.out.println("");

		Calculation(348, 75, 0);
		System.out.println("");

		If_Statement(30, 20);
		System.out.println("");

		For_Loop();
		System.out.println("");

		While_Loop();
		System.out.println("");

	}

}
