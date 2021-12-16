import java.util.Random;
import java.util.Scanner;
public class Game{
  private int[] answer;
  private String title = "CodeBreaker";
  private String rule = "隠された３つの数字を当てます。\n"
                      +"一つの数字は１から６までの間です。\n"
                      +"３つの答えの中に同じ数字はありません。\n"
                      +"入力した数字の、位置と数字が当たってたらヒット、\n"
                      +"数字だけ当たってたらブローとカウントします。\n"
                      +"3つともヒットしたら終了です。";

  private int[] input;
  private int numberOfAnswers = 3;//将来的に拡張することを考慮して作成
  private int widthOfRandom = 7; //random.nextInt()で乱数を作成している為範囲は0~6

  private int hit;
  private int blow;
  Random random = new Random();
  int a1;
  int a2;
  int a3;

  public Game(){
    answer = new int(numberOfAnswers);
    input = new int(numberOfAnswers);
  }

  public Game(int numberOfAnswers){
    this.numberOfAnswers = numberOfAnswers;
    input = new int(numberOfAnswers);
    answer = new int(numberOfAnswers);
  }

  public makeAnswer(){
    answer = new int[numberOfAnswers];
    a1 = random.nextInt(widthOfRandom);
    a2 = random.nextInt(widthOfRandom);
    a3 = random.nextInt(widthOfRandom);
    if(a1 != a2 && a1 != a3 && a2 != a3){
      answer = {a1, a2, a3};
    }else{
      return null;
    }
  }

  public inputAnswer(){
      System.out.println("３桁の数字を半角スペースを入れて入力してください");
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      String[] values = line.split(" ", 0);//第二引数の0は末尾の空白の削除
      input = new int[values.length];
      for(int i=0;i<values.length;i++){
        input[i] = Integer.parseInt(values[i]);//String型をint型に変更
      }
  }

  public judge(){
     for(int i=0;i<input.length;i++){
        if(input[i] == answer[i]){
          hit++;
        }
      }
      for(int i=0;i<input.length;i++){
        for(int j=0;j<input.length;j++){
          if(i != j && numbers[i] == comp_numbers[j]){
            blow++;
          }
        }
      }
  }

}