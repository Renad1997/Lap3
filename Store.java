import java.util.ArrayList;


public class Store {
     ArrayList<User> myUsers;
     ArrayList<Media> myMedia;


    public Store() {
       myUsers = new ArrayList<>();
       myMedia = new ArrayList<>();

    }

       public void addUser(User user) {
       myUsers.add(user);
    }



    public void addMedia(Media media) {
        myMedia.add(media);
    }



    public void displayUsers() {
        myUsers.forEach(user -> System.out.println(user.toString()));
    }



    public void displayMedia() {
        myMedia.forEach(media -> System.out.println(media.toString()));
    }

    public Book searchBook(String title) {
       for(Media media : myMedia) {
           if(media.getTitle().equals(title)) {
               return (Book)media;
           }
       }
       return null;
    }

}
