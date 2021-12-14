import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck{

  final int CARD_TOTAL = 52;
  private List card_list;
  private int card_index = 0;

  public Deck(){
      card_index = 0;
      card_list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51));
      Collections.shuffle(card_list);
  }

  public Card getCard(){
    Card card_info = new Card();
    int card_no = 0;

    card_no = (int)(card_list.get(card_index));
    card_index++;

    if(card_index <= CARD_TOTAL){
      card_info.suit = card_no/13;
      card_info.no = (card_no%13)+1;
    }else{
      card_index = 0;
      Collections.shuffle(card_list);
    }
    return card_info;

  }

}