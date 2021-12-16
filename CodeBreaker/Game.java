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
<<<<<<< HEAD
  private int widthOfRandom = 6; 

  private int hit = 0;
  private int blow = 0;
=======
  private int widthOfRandom = 7; //random.nextInt()で乱数を作成している為範囲は0~6

  private int hit;
  private int blow;
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
  Random random = new Random();
  int a1;
  int a2;
  int a3;

  public Game(){
<<<<<<< HEAD
    answer = new int[numberOfAnswers];
    input = new int[numberOfAnswers];
=======
    answer = new int(numberOfAnswers);
    input = new int(numberOfAnswers);
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
  }

  public Game(int numberOfAnswers){
    this.numberOfAnswers = numberOfAnswers;
<<<<<<< HEAD
    input = new int[numberOfAnswers];
    answer = new int[numberOfAnswers];
  }

  public void makeAnswer(){
    answer = new int[numberOfAnswers];
    for(int i=0;i<answer.length;i++){
      boolean flag = false;
      answer[i] = (int)(Math.random()*widthOfRandom+1);
      do{
        flag = false;
        for(int j = i-1;j>=0;j--){
          if(answer[i] == answer[j]){
            flag = true;
            answer[i] = (int)(Math.random()*widthOfRandom+1);
          }
        }
      }while(flag == true);
    }
  }

  public void inputAnswer(){
=======
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
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
      System.out.println("３桁の数字を半角スペースを入れて入力してください");
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      String[] values = line.split(" ", 0);//第二引数の0は末尾の空白の削除
      input = new int[values.length];
      for(int i=0;i<values.length;i++){
        input[i] = Integer.parseInt(values[i]);//String型をint型に変更
      }
  }

<<<<<<< HEAD
  public boolean judge(){
     hit = 0;
     blow = 0;
=======
  public judge(){
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
     for(int i=0;i<input.length;i++){
        if(input[i] == answer[i]){
          hit++;
        }
      }
      for(int i=0;i<input.length;i++){
        for(int j=0;j<input.length;j++){
<<<<<<< HEAD
          if(i != j && input[i] == answer[j]){
=======
          if(i != j && numbers[i] == comp_numbers[j]){
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
            blow++;
          }
        }
      }
<<<<<<< HEAD
      return (hit == numberOfAnswers);
  }
  public int getNumberOfAnswer(){
    return numberOfAnswers;
  }
  public int getWidthOfRandom(){
    return widthOfRandom;
  }
  public String getTitle(){
    return this.title;
  }
  public String getRule(){
    return this.rule;
  }
  public int getHit(){
    return this.hit;
  }
  public int getBlow(){
    return this.blow;
  }
  public int getInput(int i){
    return this.input[i];
  }
  public int getAnswer(int i){
    return this.answer[i];
=======
>>>>>>> 8f3cd7538037ac2595430e079fc545146902e20c
  }

}