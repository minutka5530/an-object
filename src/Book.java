public class Book {
    private String author;
    private int publicationYear;

    public Book(String author, int publicationYear){
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    public void  setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
