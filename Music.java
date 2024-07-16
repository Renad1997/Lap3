import java.util.ArrayList;

public class Music extends Media {

    private String artist;

    ArrayList<Music> playlist = new ArrayList<Music>();
    ArrayList<Music> playlist2= new ArrayList<>();

    public Music(String title, String auteur, String isbn, double price, String artist, ArrayList<Music> playlist) {
        super(title, auteur, isbn, price);
        this.artist = artist;
        this.playlist = playlist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Music> getMusicCatalog() {
        return playlist;
    }

    public void setMusicCatalog(ArrayList<Music> playlist) {
        this.playlist = playlist;
    }

    public void listen(User user){
     this.getMusicCatalog();
    }


    public String getMediaType(){
        if(getPrice() >= 10){
            return "Premium Music ";
        }else{
            return "Music";
        }
    }

    @Override
    public String toString() {
        return " Music" + " artist=" + artist + " playlist=" + playlist ;
    }
}
