public class Player{
  private Card card_info;

  public Player(){
    card_info = new Card();
    card_info.no = 0;
    card_info.suit = 0;
  }

  public void Draw(Deck d){
    card_info = d.getCard();
    return ;
  }

  public int getSuit(){
    return card_info.suit;
  }

  public int getNo(){
    return card_info.no;
  }
}