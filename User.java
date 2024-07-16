public class User {

    private String username;
    private String email;
    private Media[] purchaseMediaList;
    private Media[] shoppingCart;

    public User(String username, String email, Media[] purchaseMediaList, Media[] shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
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

    public Media[] getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(Media[] purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public Media[] getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Media[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {
     media.getMediaType();
     shoppingCart[shoppingCart.length - 1] = media;


    }
    public void removeFromCart(Media media) {
        shoppingCart[shoppingCart.length - 1] = media;

    }
    public void checkout(){

    }
}
