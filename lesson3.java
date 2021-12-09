public class Lesson3{
  public static void main(String[] args){
    int[] array = {3, 4, 9};
    System.out.println("一桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    //配列を回しながた判定、n = array[n]
    for(int n : array){
      if(n == input){
        System.out.println("あたり");
      }
    }
  }
}