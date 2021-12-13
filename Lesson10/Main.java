import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    BankAccounts a = new BankAccounts("4649", 1592);
    System.out.println(a.toString());
    BankAccounts b = new BankAccounts(" 4649", 1592);
    
    if(b.equals(a)){
      System.out.println("口座番号を承認しました");
    }else{
      System.out.println("口座番号を受付ませんでした。");
    }

  }
}