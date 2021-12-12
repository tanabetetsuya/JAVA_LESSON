public class Wizard{
  private int hp;
  private int mp;
  private String name;
  Wand w = new Wand("魔法の杖", 50);

  public void heal(Hero h){
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.w.getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    System.out.println(h.getName()+"のHPは"+h.getHp());
  }
}