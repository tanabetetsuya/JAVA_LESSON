import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    BankAccounts a = new BankAccounts("4649", 1592);
    System.out.println(a.toString());
    Scanner scanner = new Scanner(System.in);
    System.out.println("口座番号を入力してください");
    String s = scanner.next();
    BankAccounts b = new BankAccounts(s, 1592);
    if(b.accountNumber.equals(a.accountNumber)){
      System.out.println("口座番号を承認しました");
    }else{
      System.out.println("口座番号を受付ませんでした。");
    }

  }
}