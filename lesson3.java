public class Lesson3{
  public static void main(String[] args){
    int[] array = {3, 4, 9};
    System.out.println("一桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    if(input == 3 || input == 4 || input == 9){
      System.out.println("あたり");
    }
  }
}