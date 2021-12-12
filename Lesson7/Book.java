public class Book extends TangibleAsset{
  String isbn;
  
  //コンストラクタ
  public Book(String name, int price, String color, String isbn){
    super(name, price, color);
    this.isbn = isbn;
  }

  public String getName(){
    return this.name;
  }
  public int getPrice(){
    return this.price;
  }
  public String getColor(){
    return this.color;
  }
  public String getIsbn(){
    return this.isbn;
  }

}