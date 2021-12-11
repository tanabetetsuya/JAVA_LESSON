public class Main{
  public static void main(String[] args){
    PoisonMatango pm = new PoisonMatango('A');
    Hero h = new Hero();
    h.name = "牧人";
    h.hp = 100;
    pm.attack(h);
    
  }
}