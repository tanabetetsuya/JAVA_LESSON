public class Main{
  public static void main(String[] args){
    try{
      String s = null;
      System.out.println(s.length());
    }catch(Exception e){
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("--スタックトレースを表示する");
      e.printStackTrace();
      System.out.println("--スタックトレースはここまで");
    }
  }
}