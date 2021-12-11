public class Matango{
  int hp = 50;
  final int Level = 10; //フィールドLevelは10で固定
  char suffix;

  public Matango(char suffix){
    this.suffix = suffix;
  }

  public void attack(Hero h){
    System.out.println("キノコ"+this.suffix+"の攻撃");
    System.out.println("10のダメージ");
    h.hp -= 10;
  }
  
  public void run(){
    System.out.println("おばけキノコ"+this.suffix+"は逃げ出した!");
  }
}