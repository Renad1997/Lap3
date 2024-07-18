import java.util.ArrayList;
import java.util.List;

public class Music extends Media {

    private String artist;



    public Music(String title, String auteur, String isbn, double price, String artist) {
        super(title, auteur, isbn, price);
        this.artist = artist;

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void listen(User user){
     user.purchaseMediaList.add(this);
    }
     public List<Music> generatePlayList(List<Music> musicCatlog){
         ArrayList<Music> similarMusic = new ArrayList<>();
         for (Music music : musicCatlog) {

             if(music.getAuteur().compareTo(this.getAuteur()) == 0 ) {
                 similarMusic.add(music);
             }
         }
         return similarMusic;
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
        return super.toString() + " artist=" + artist ;
    }
}
