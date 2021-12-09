public class Lesson4{
  public static void introduceOneself(){
    String name = "田辺";
    int age = 27;
    float height = 168;
    String zodiac = "亥";
    System.out.println("私の名前は"+name+"です。年齢は"+age+"です。身長は"+height+"です。干支は"+zodiac+"です。");
  }

  public static void email(String title, String address, String text){
    System.out.println(address+"に、以下のメールを送信しました");
    System.out.println("件名:"+title);
    System.out.println("本文:"+text);
  }
  //emailメソッドをオーバーロード
  public static void email(String address, String text){
    System.out.println(address+"に、以下のメールを送信しました");
    System.out.println("無題");
    System.out.println("本文:"+text);
  }

  public static double calcTriangleArea(double x, double y){
    double ans = (x*y)/2;
    return ans;
  }

  public static double calcCircleArea(double radius){
    double ans = radius*radius*3.14;
    return ans;
  }

  public static void main(String[] args){
    introduceOneself();
    System.out.println(calcTriangleArea(10.0, 5.0));
    System.out.println(calcCircleArea(5.0));
  }
}