import java.util.Random;

public class Lesson1{
  public static void main(String[] args){
    Random random = new Random();
    int isHungry = random.nextInt(2);
    String food = "ラーメン";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです。");
    }else{
      System.out.println("腹ペコです。");
      System.out.println(food + "をいただきます。");
    }
      System.out.println("ご馳走様でした。");
  }
}