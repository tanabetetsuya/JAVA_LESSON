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
    Hero h1 = new Hero("齋藤");
    Hero h2 = new Hero("鈴木");
    List<Hero> list = new ArrayList<Hero>();
    list.add(h1);
    list.add(h2);
    for(Hero h: list){
      System.out.println(h.getName());
    }
    Map<Hero, Integer> knockDown = new HashMap<Hero, Integer>();
    knockDown.put(h1, 3);
    knockDown.put(h2, 7);
    for(Hero h: knockDown.keySet()){
      int i = knockDown.get(h);
      System.out.println(h.getName()+"の倒した数"+"="+i);
    }
  }
}
