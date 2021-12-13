import java.lang.String;
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

  public boolean equals(BankAccounts a){
    //this.accountNumber.trim() == a.acountNumberでbの口座番号の頭に半角スペースを
    //入れても値が等しいと見なされなかったのは.trim()を加えることで別のインスタンスになって
    //しまったため。
    if(this.accountNumber.trim().equals(a.accountNumber)){
      return true;
    }else{
      return false;
    }
  }
}