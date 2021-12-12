public abstract class TangibleAsset extends Asset{
  String name;
  int price;
  String color;

  public TangibleAsset(String name, int price, String color){
    super(name, price, color);
  }


//抽象メソッドの定義
public abstract String getName();
public abstract int getPrice();
public abstract String getColor();

}
