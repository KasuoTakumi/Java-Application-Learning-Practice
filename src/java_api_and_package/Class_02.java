/*
 * Stringオブジェクトの生成方法による違い
 *
 * Stringはほかのクラスと同じようにnewキーワードを使って生成することができる
 * 基本形のように
 * String 変数名 = "Hello";
 * のようにも使える。
 */

package java_api_and_package;

public class Class_02 {

	public static void StringObj1() {
		String s1 = new String("こんにちわ");
		String s2 = new String("こんにちわ");

		System.out.println("newあり"+(s1 == s2));

	}

	public static void StringObj2() {
		String s1 = "こんにちわ";
		String s2 = "こんにちわ";

		System.out.println("newなし"+(s1 == s2));

	}

	public static void main(String[] args) {

		System.out.println("String型（Stringクラス）のStringオブジェクトの生成方法による違い");
		System.out.println("");
		StringObj1();
		StringObj2();

	}

}
