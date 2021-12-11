public class Thief{
  String name;
  int hp;
  int mp;

  public Thief(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public Thief(String name, int hp){
    this("アサカ", 35, 5);
  }

  public Thief(String name){
    this("アサカ", 40, 5);
  }
}