public class Wand{
  private String name;
  private double power;

  public Wand(String name, double power){
    this.name = name;
    this.power = power;
  }
  public double getPower(){
    return this.power;
  }
  public String getName(){
    return this.name;
  }

  public void setPower(double power){
    if(this.power < 0.5 && this.power > 100){
      throw new IllegalArgumentException
      ("処理を中断");
    }
    this.power = power;
  }
  public void setName(String name){
    if(this.name.length() < 3){
      throw new IllegalArgumentException
      ("処理を中断");
    }
    this.name = name;
  }
}