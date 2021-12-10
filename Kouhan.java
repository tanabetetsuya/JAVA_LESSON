package comment;

public class Kouhan{
  public static void callDeae(){
    System.out.println("ええい、曲者");
  }

  public static void showMondokoro() throws Exception {
    System.out.println("飛車さん、角さん。");
    System.out.println("この紋所が目に入らぬか");
    Thread.sleep(3000);//３秒間の停止時間を追加
    comment.Zenhan.doTogame();
  }
}