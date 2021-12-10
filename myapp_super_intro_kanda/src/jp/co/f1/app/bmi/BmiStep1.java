/*
 * プログラム名：BMI計算プログラム Step1（変数定義・画面表示）
 * プログラムの説明：身長と体重をコンソール画面に出力します。
 *
 * 作成者：神田ITスクール
 * 	作成日：2018年12月03日
 */

package jp.co.f1.app.bmi;

public class BmiStep1 {

	public static void main(String[] args) {

		// 開始メッセージ
		System.out.println( "※※BMI計算プログラムを開始します※※");
		System.out.println();

		// 変数定義
		double height = 170.0;		//身長(単位cm)を管理する変数
		double weight = 56.0;		//開始体重（単位kg）を管理する変数

		// 体重、身長の画面出力
		System.out.print("身長が ");
		System.out.print(height);
		System.out.print("cm、体重が ");
		System.out.print(weight);
		System.out.println("kg");

		// 終了メッセージ
		System.out.println();
		System.out.println( "※※BMI計算プログラムを終了します※※");

	}

}
