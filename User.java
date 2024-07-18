import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    public ArrayList<Media> purchaseMediaList;
    public ArrayList<Media> shoppingCart;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void addToCart(Media media) {
    shoppingCart.add(media);


    }
    public void removeFromCart(Media media) {
     shoppingCart.remove(media);

    }
    public void checkout(){
    shoppingCart.forEach(s-> {
        if(s instanceof Book){
            Book book = (Book) s;
            book.purchase(this);
        }else if(s instanceof Movie){
            Movie movie = (Movie) s;
            movie.watch(this);
        }else{
            Music  music = (Music) s;
            music.listen(this);
        }
    });
     shoppingCart.clear();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
