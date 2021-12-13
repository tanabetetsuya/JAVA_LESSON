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

  public boolean equals(String accountNumber){
    if(this.accountNumber == accountNumber){
      return true;
    }else{
      return false;
    }
  }
}