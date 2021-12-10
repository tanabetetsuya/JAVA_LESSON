public class Hero{
  String name;
  int hp;

  public void sleep(){
    this.hp = 100; //自分自身のhpフィールド
    System.out.println(this.name+"は、眠って回復した!"); //this.name => 自分自身のnameフィールド
  }
  public void sit(int sec){
    this.hp += sec; //座った秒数分、体力を回復
    System.out.println(this.name+"は、"+sec+"秒座った!");
    System.out.println(this.name+"は、"+sec+"HP回復した!");
  }
}