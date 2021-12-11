public class Hero{
  String name;
  int hp;
  Sword sword; //勇者が装備している剣の情報

  public void sleep(){
    this.hp = 100; //自分自身のhpフィールド
    System.out.println(this.name+"は、眠って回復した!"); //this.name => 自分自身のnameフィールド
  }
  public void sit(int sec){
    this.hp += sec; //座った秒数分、体力を回復
    System.out.println(this.name+"は、"+sec+"秒座った!");
    System.out.println(this.name+"は、"+sec+"HP回復した!");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name+"は、転んだ!");
    System.out.println("-5のダメージ");
  }
  public void run(){
    System.out.println(this.name+"は逃げ出した!");
    System.out.println("gameover");
    System.out.println("最終HPは"+this.hp+"でした。");
  }
}