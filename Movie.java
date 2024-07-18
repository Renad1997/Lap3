import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {

    private  int duration;



    public Movie(String title, String auteur, String isbn, double price, int duration) {
        super(title, auteur, isbn, price);
        this.duration = duration;

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

   public ArrayList<Movie> recommendSimilarMovies(List<Movie> movies) {
        ArrayList<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movies) {

            if(movie.getAuteur().compareTo(this.getAuteur()) == 0 ) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;
   }


    public void watch(User user){
       user.purchaseMediaList.add(this);
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
        return super.toString() + " duration=" + duration ;
    }
}
