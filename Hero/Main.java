public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    //System.out.println("勇者"+h.name+"を生み出しました。");
    //h.sit(5);
    //h.slip();
    //h.sit(25);
    //h.run();

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    //冒険の始まり
    //h.slip();
    //m1.run();
    //m2.run();
    //h.run();

    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    h.sword = s; //swordフィールドに生成済みの剣インスタンスを代入
    System.out.println("現在の武器は"+ h.sword.name);
    h.attack();

    Hero h1 = new Hero();
    h1.name = "カイト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "シズク";
    h2.hp = 150;
    Wizard w = new Wizard();
    w.name = "ウィザード";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}