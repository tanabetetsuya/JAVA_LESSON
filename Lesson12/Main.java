import java.util.*;
public class Main{
  public static void main(String[] args){
    Set<String> prefectures = new HashSet<String>();
    prefectures.add("神奈川");
    prefectures.add("東京");
    for(String s: prefectures){
      System.out.println(s);
    }
    List<Integer> score = new ArrayList<Integer>();
    score.add(30);
    score.add(59);
    score.add(100);
    score.add(42);
    score.add(67);
    for(int i: score){
      System.out.println(i);
    }
    Map<String, Integer> primeMinister = new HashMap<String, Integer>();
    primeMinister.put("菅", 3);
    primeMinister.put("安倍", 4);
    for(String s : primeMinister.keySet()){
       int i = primeMinister.get(s);
       System.out.println("総理大臣"+s+"の任期は"+i+"です");
    }
  }
}
public class Hero{
  private String name;
  public Hero(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}