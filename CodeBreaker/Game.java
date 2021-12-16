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
  private int widthOfRandom = 6; 
  private int hit;
  private int blow;

  Random random = new Random();
  int a1;
  int a2;
  int a3;

  public Game(){

    answer = new int[numberOfAnswers];
    input = new int[numberOfAnswers];
    makeAnswer();

  }

  public Game(int numberOfAnswers){
    this.numberOfAnswers = numberOfAnswers;

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
    input = new int[numberOfAnswers];
    answer = new int[numberOfAnswers];
  }


  public void inputAnswer(int index, int answer){
        if(index > -1 && index < numberOfAnswers){
          if(answer > 0 && answer <= widthOfRandom){
            input[index] = answer;
          }
        }
  }
  public void inputAnswer(int index, String string){
    int answer;
    answer = Integer.parseInt(string);
    inputAnswer(index, answer);
  }


  public boolean judge(){
     hit = 0;
     blow = 0;
     for(int i=0;i<input.length;i++){
        if(input[i] == answer[i]){
          hit++;
        }
      }
      for(int i=0;i<input.length;i++){
        for(int j=0;j<input.length;j++){
          if(i != j && input[i] == answer[j]){
            blow++;
          }
        }
      }
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
  public int[] getInput(){
    return this.input;
  }
  public int getInput(int i){
    return this.input[i];
  }
  public int[] getAnswer(){
    return this.answer;
  }
  public int getAnswer(int i){
    return this.answer[i];
  }

}