public class AcademicBook extends Book {

    private String subject;

    public AcademicBook(String title, String auteur, String isbn, double price, int stock, int[] reviews, String subject) {
        super(title, auteur, isbn, price, stock, reviews);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMediaType(){
        if(getAverageRating() >= 4.5){
            return "Bestselling AcademicBook";
        }else{
            return "AcademicBook";
        }

    }

    @Override
    public String toString() {
        return " AcademicBook" + " subject=" + subject;
    }
}
