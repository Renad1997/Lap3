//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Book book1 = new Book("Java","ali","123",200.32,100);
        Book book2 = new Book("C++","ahmad","778",350.15,50);
        Movie movie1 = new Movie("from","nasser","12R",50.25,3);
        Movie movie2 = new Movie("minions","mohammed","18R",80.44,2);
        Music music1 = new Music("thousand years","christina","1289",70.12,"taylor");
        Music music2 = new Music("blue jeans","lana","6655",300.89,"elsa");
        User user1 = new User("Renad","renad6633@hotmail.com");
        User user2 = new User("Majd","majd@hotmail.com");
        Review review1 = new Review("yara",4.5,"is good");
        Review review2 = new Review("sami",3.2,"is bad");
       Novel novel1 = new Novel("the silent","alex","198",45.00,30,"Drama");
       Novel novel2 = new Novel("wish","barbara","732",30.00,70,"Anime's");
       AcademicBook academicBook1 = new AcademicBook("power","robert greene","5319",74.31,15,"the 48 laws of power");
       AcademicBook academicBook2 = new AcademicBook("learning","keith folse","9935",279.12,28,"great writing");

        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(academicBook1);
        store.addMedia(academicBook2);
        store.addUser(user1);
        store.addUser(user2);
        store.displayMedia();
        store.displayUsers();
     System.out.println("Search  book: "+store.searchBook("Java"));
     System.out.println("Search  book:" + store.searchBook("power"));

        user1.addToCart(book1);
        user1.addToCart(movie2);
        user1.addToCart(music1);
        user1.addToCart(novel2);
        user1.addToCart(academicBook1);
     System.out.println("Shopping cart: "+user1.shoppingCart);
        user1.removeFromCart(book1);
     System.out.println("Shopping cart after remove: "+user1.shoppingCart);
        user1.checkout();
     System.out.println("Shopping cart after checkout: "+user1.shoppingCart);
     System.out.println("Purchased media: "+user1.purchaseMediaList);


        book1.addReview(review1);
        book2.addReview(review2);
     System.out.println("the reviews: "+book1.reviews);
     System.out.println("the reviews: "+book2.reviews);

        book1.getAverageRating();
        book2.getAverageRating();
     System.out.println("Rating is: "+book1.getAverageRating());
     System.out.println("Rating is: "+book2.getAverageRating());


     book1.isBestseller();
     book2.isBestseller();
     System.out.println(" Bestseller: "+book1.isBestseller());
     System.out.println("Bestseller: "+book2.isBestseller());

     book1.restock(15);
     book2.restock(20);
     System.out.println("Restock after restock: "+book1.getStock());
     System.out.println("Restock after restock: "+book2.getStock());


       book1.purchase(user1);
     System.out.println("User1 preached media: "+user1.purchaseMediaList);
        book2.purchase(user2);
     System.out.println("User2 preached media: "+user2.purchaseMediaList);



        movie1.watch(user1);
     System.out.println("user1 watched movie: " +user1.purchaseMediaList);

        music2.listen(user2);
     System.out.println("user2 listen music: "+user2.purchaseMediaList);

     System.out.println("User2 preached media: "+user1.purchaseMediaList);

        
    }
}