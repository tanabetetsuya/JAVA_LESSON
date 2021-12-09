public class Lesson4{
  public static void introduceOneself(){
    String name = "田辺";
    int age = 27;
    float height = 168;
    String zodiac = "亥";
    System.out.println("私の名前は"+name+"です。年齢は"+age+"です。身長は"+height+"です。干支は"+zodiac+"です。");
    email("面接日程調整", "test@test.com", "希望日程は12/1です。");
  }

  public static void email(String title, String address, String text){
    System.out.println(address+"に、以下のメールを送信しました");
    System.out.println("件名:"+title);
    System.out.println("本文:"+text);
  }

  public static void main(String[] args){
    introduceOneself();
  }
}