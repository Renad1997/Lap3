public class Store {
    private User[] users;
    private Media[] medias;


    public Store(User[] users, Media[] medias) {
        this.users = users;
        this.medias = medias;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Media[] getMedias() {
        return medias;
    }

    public void setMedias(Media[] medias) {
        this.medias = medias;
    }

    public void addUser(User user) {
      for (int i = 0; i < users.length; i++) {
          if (users[i].equals(user)) {
              users[i] = user;
          }
      }
        users = users;
    }

    public User[] displayUsers() {
        return users;
    }

    public void addMedia(Media media) {
        medias = medias;
    }

    public Media[] displayMedia() {
        return medias;
    }

    public Book searchBook(String title) {
        searchBook(title).getTitle();
     return null ;
    }

}
