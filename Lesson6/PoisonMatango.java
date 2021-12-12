public class PoisonMatango extends Matango{
  
  public PoisonMatango(char suffix){
      super(suffix);
  }

  public void attack(Hero h){
    int attack_number = 5;
    while(attack_number > 0){
      super.attack(h);
      System.out.println("さらに毒の胞子をばらまいた");
      System.out.println(h.hp/5+"ポイントのダメージ");
      h.hp -= h.hp/5;
      System.out.println(h.name+"は"+h.hp+"HPである");
      attack_number--;
    }
  }
}