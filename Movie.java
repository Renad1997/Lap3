import java.util.ArrayList;

public class Movie extends Media {

    private  int duration;

   private ArrayList<Movie> movieCatalog = new ArrayList<Movie>();

    public Movie(String title, String auteur, String isbn, double price, int duration, ArrayList<Movie> movieCatalog) {
        super(title, auteur, isbn, price);
        this.duration = duration;
        this.movieCatalog = movieCatalog;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Movie> getMovieCatalog() {
        return movieCatalog;
    }

    public void setMovieCatalog(ArrayList<Movie> movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void watch(User user){
       user.getPurchaseMediaList();
       movieCatalog.add(this);
    }




    public String getMediaType(){
        if(getDuration() >= 120){
            return "Long Movie";
        }else {
        return "Movie";
        }
    }

    @Override
    public String toString() {
        return " Movie" + " duration=" + duration + " movieCatalog=" + movieCatalog;
    }
}
