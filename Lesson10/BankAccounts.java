public class BankAccounts{
  String accountNumber;
  int balance;

  public BankAccounts(String accountNumber, int balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String toString(){
    return "¥"+ this.balance+"(口座番号:"+this.accountNumber+")";
  }
  
  public static void main(String[] args){
    BankAccounts a = new BankAccounts("4649", 1592);
    System.out.println(a.toString());
  }
}