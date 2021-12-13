public class Wizard{
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(this.name.length() < 3){
      throw new IllegalArgumentException
      ("処理を中断");
    }
      this.name = name;
  }
  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    if(this.hp >= 0){
      this.hp = hp;
    }else{
      this.hp = 0;
    }
  }
  public int getMp(){
    return this.mp;
  }
  public void setMp(int mp){
    if(this.mp >= 0){
      throw new IllegalArgumentException
      ("処理を中断");
    }
      this.hp = hp;
  }
  //魔法使いが杖を持つメソッドを追加
  public Wand getWand(){
    return this.wand;
  }
  public void setWand(Wand wand){
    this.wand = wand;
  }

  public void heal(Hero h){
    int basePoint = 10;
    int recoverPoint = (int)(basePoint*this.getWand().getPower());
    h.setHp(h.getHp() + recoverPoint);
    System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");
    System.out.println(h.getName()+"のHPは"+h.getHp());
  }
}