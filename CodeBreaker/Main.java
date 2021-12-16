import java.util.Random;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){

    Random random = new Random();

    int a1 = random.nextInt(10);
    int a2 = random.nextInt(10);
    int a3 = random.nextInt(10);
    int[] comp_numbers = {a1, a2, a3};

    while(true){
      int hit_number = 0;
      int brow_number = 0;
      System.out.println("３桁の数字を半角スペースを入れて入力してください");
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      String[] values = line.split(" ", 0);//第二引数の0は末尾の空白の削除
      int[] numbers = new int[values.length];
      for(int i=0;i<values.length;i++){
        numbers[i] = Integer.parseInt(values[i]);//String型をint型に変更
      }
      
      for(int i=0;i<numbers.length;i++){
        if(numbers[i] == comp_numbers[i]){
          hit_number++;
        }
      }
      for(int i=0;i<numbers.length;i++){
        for(int j=0;j<numbers.length;j++){
          if(i != j && numbers[i] == comp_numbers[j]){
            brow_number++;
          }
        }
      }

      System.out.println("あなたが入力した数字は"+numbers[0]+numbers[1]+numbers[2]+"です");
      System.out.println("ヒット回数は"+hit_number+"です");
      System.out.println("ブローの回数は"+brow_number+"です");

      if(hit_number == 3){
        System.out.println("正解です");
        System.out.println("コンピューターの数字は"+comp_numbers[0]+comp_numbers[1]+comp_numbers[2]+"でした");
        break;
      }
    }

  }
}