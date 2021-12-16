import java.util.Random;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){

    
    Game game = new Game();

    System.out.println(game.getTitle());
    System.out.println(game.getRule());

    game.makeAnswer();


    while(true){

      game.inputAnswer();
      game.judge();
    

      System.out.println("あなたが入力した数字は"+game.getInput(0)+game.getInput(1)+game.getInput(2)+"です");
      System.out.println("ヒット回数は"+game.getHit()+"です");
      System.out.println("ブローの回数は"+game.getBlow()+"です");

      boolean end = game.judge();

      if(end)){
        System.out.println("正解です");
        System.out.println("コンピューターの数字は"+game.getAnswer(0)+game.getAnswer(1)+game.getAnswer(2)+"でした");
        break;
      }
    }

  }
}