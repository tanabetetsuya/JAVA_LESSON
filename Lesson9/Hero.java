public class Hero{
  private int hp;
  private String name;

  public Hero(String name, int hp){
    this.name = name;
    this.hp = hp;
  }

  public int getHp(){
    return this.hp;
  }
  public void setHp(int hp){
    this.hp = hp;
  }
  public String getName(){
    return this.name;
  }
}