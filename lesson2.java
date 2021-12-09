public class Lesson2{
  public static void main(String[] args){
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];

    int[] moneyList = new int[3];
    moneyList[0] = 121902;
    moneyList[1] = 8302;
    moneyList[2] = 55100;
    for(int i=0;i<3; i++){
      System.out.println(moneyList[i]);
    }
    //拡張for文
    for(int i : moneyList){
      System.out.println(i);
    }
    }
}