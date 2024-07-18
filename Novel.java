public class Novel extends Book {
    private String genre;

    public Novel(String title, String auteur, String isbn, double price, int stock, String genre) {
        super(title, auteur, isbn, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType(){
        if(super.getAverageRating() >= 4.5){
            return "Bestselling Novel";
        }else{
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " genre=" + genre ;
    }
}
