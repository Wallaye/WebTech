package laba1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book book){
            return this.title.equals(book.title) && this.author.equals(book.author);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return price * 10 + author.hashCode() + title.hashCode() * 23 + 1263;
    }
    @Override
    public String toString(){
        return "Author: " + author + "\nTitle: " + title + "\nPrice: " + price;
    }
}
