/*
 * プログラム名：BMI計算プログラム Step2（代入・計算）
 * プログラムの説明：身長と体重を元にBMI値を計算し、コンソール画面に出力します。
 *
 * 作成者：神田ITスクール
 * 	作成日：2018年12月03日
 */

package jp.co.f1.app.bmi;

public class BmiStep2 {

	public static void main(String[] args) {

		// 開始メッセージ
		System.out.println( "※※BMI計算プログラムを開始します※※");
		System.out.println();

		// 変数定義
		double height = 170.0;		//身長(単位cm)を管理する変数
		double weight = 56.0;		//開始体重（単位kg）を管理する変数
		double bmi = 0.0;		//BMI値を管理する変数

		// 体重、身長の画面出力
		System.out.println( "身長が " + height + "cm、体重が " + weight + "kgの場合");

		// cm --> mに変換（身長に0.01をかけて変換）
		height = height * 0.01;

		// BMIの計算
		bmi = weight / (height * height);

		// BMIの画面出力
		System.out.println( "BMIの値は " + bmi + "です。");

		// 終了メッセージ
		System.out.println();
		System.out.println( "※※BMI計算プログラムを終了します※※");

	}

}
