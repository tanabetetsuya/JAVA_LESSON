public class Main{
  public static void main(String[] args){
    String file = "readme.txt";
    String folder = "c:¥user¥";
    Combine com = new Combine(file, folder);
    StringBuilder sb = new StringBuilder();
    for(int i=1;i<101;i++){
      sb.append(i+",");
    }

  }
}