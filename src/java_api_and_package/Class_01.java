/*
 * パッケージの利用
 * ===========================
 * java.util
 */

package java_api_and_package;

import java.util.Random;

public class Class_01 {

	public static void random() {//Random

		Random rand = new Random();
		System.out.println(rand.nextInt());

	}

	public static void main(String[] args) {

		random();

	}

}
