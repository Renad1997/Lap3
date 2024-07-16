import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{

    private int stock;
    private int [] reviews ;

   private static ArrayList<Integer> bookslist= new ArrayList<Integer>();

    public Book(String title, String auteur, String isbn, double price, int stock, int[] reviews) {
        super(title, auteur, isbn, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int[] getReviews() {
        return reviews;
    }

    public void setReviews(int[] reviews) {
        this.reviews = reviews;
    }

    public void addReview (Review r) {
       // this.reviews.add(r);
     for (int i = 0; i < reviews.length; i++) {
         bookslist.add(reviews[i]);
     }

    }
    public double getAverageRating(){
        int sum=0;
        for(int i=0; i<reviews.length; i++){
            sum+=reviews[i];
        }
        double Avg=sum/reviews.length;
        return Avg;
    }

    public void purchase(User user){
       user.getPurchaseMediaList();
       int setStock=1;
       getStock();


    }

    public boolean isBestseller(){
        boolean bestseller=false;
        for(int i=0; i<getAverageRating(); i++){
            if(getAverageRating() >= 4.5){
                bestseller=true;
            }else{

            }
        }

        return false;
    }
    public void restock(int quantity){
        quantity-=getStock();
        if(quantity<=0){
            setStock(0);
        }else{
            setStock(quantity);
        }

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
        return " Book" + " stock=" + stock + " reviews=" + Arrays.toString(reviews) ;
    }
}
