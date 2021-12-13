import java.util.Random;
public class Cleric{
  String name;
  int HP = 50;
  final int MAX_HP = 50;
  int MP = 10;
  final int MAX_MP =10;

  public void selfAid(){
    this.MP -= 5;
    this.HP = this.MAX_HP;
  }

  public int pray(int sec){
    Random random = new Random();
    int recoverPoint = sec + random.nextInt(2);
    this.MP += recoverPoint;
    if(this.MP <= this.MAX_MP){
      return this.MP;
    }else{
      return this.MAX_MP;
    }
    
  }
}