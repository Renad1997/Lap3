import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{

    private int stock;
    public ArrayList<Review> reviews ;



    public Book(String title, String auteur, String isbn, double price, int stock) {
        super(title, auteur, isbn, price);
        this.stock = stock;
        this.reviews = new ArrayList<Review>();

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void addReview (Review r) {
     reviews.add(r);
    }
    public double getAverageRating(){
        double sum = 0;
        for(int i=0; i<reviews.size(); i++){
            sum+= reviews.get(i).getRating();
        }
        double Avg=sum/reviews.size();
        return Avg;
    }

    public void purchase(User user){
       user.purchaseMediaList.add(this);
       this.stock -= 1;


    }

    public boolean isBestseller(){
            if(getAverageRating() >= 4.5){
               return true;
            }else{
                return false;
            }



    }
    public void restock(int quantity){
     this.stock += quantity;
        System.out.println("the stock is restocking by " + quantity + " the stock now have " + this.stock);

    }

    public String getMediaType(){
        if (getAverageRating() >= 4.5){
            return "Bestselling Book";
        }else{
            return "Book" ;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " and the stock is " + getStock();
    }
}
