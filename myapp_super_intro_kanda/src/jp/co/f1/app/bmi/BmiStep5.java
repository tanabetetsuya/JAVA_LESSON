/*
 * プログラム名：BMI計算プログラム Step5（if-else文の条件分岐）
 * プログラムの説明：入力された身長と体重を元にBMI値を計算し、コンソール画面に出力します。
 * 　　　　　　　　　BMIが25以上の場合とそれ以外の場合でそれぞれメッセージを出力します。
 * 作成者：神田ITスクール
 * 	作成日：2018年12月04日
 */

package jp.co.f1.app.bmi;

import java.util.Scanner;

public class BmiStep5 {

	public static void main(String[] args) {

		// 開始メッセージ
		System.out.println( "※※BMI計算プログラムを開始します※※");
		System.out.println();

		// 変数定義
		double height = 0.0;		//身長(単位cm)を管理する変数
		double weight = 0.0;		//開始体重（単位kg）を管理する変数
		double bmi = 0.0;		//BMI値を管理する変数
		Scanner sc = new Scanner(System.in);

		// 身長を入力
		System.out.print("身長(単位cm)を入力してください>");
		height = sc.nextDouble();

		// 体重を入力
		System.out.print("体重(単位kg)を入力してください>");
		weight = sc.nextDouble();

		// 体重、身長の画面出力
		System.out.println( "身長が " + height + "cm、体重が " + weight + "kgの場合");

		// cm --> mに変換（身長に0.01をかけて変換）
		height = height * 0.01;

		// BMIの計算
		bmi = weight / (height * height);

		// BMIの画面出力
		System.out.println( "BMIの値は " + bmi + "です。");

		// BMIに応じてメッセージを出力
		if(bmi >=25.0) {
			// 25.0以上の場合
			System.out.println("太り気味です。");
		} else {
			// それ以外の場合
			System.out.println("太ってはいません。");
		}

		// 終了メッセージ
		System.out.println();
		System.out.println( "※※BMI計算プログラムを終了します※※");

	}

}
