package laba1.task14;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;


    public Book(String title, String author, int price, int isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }
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

    @Override
    public int compareTo(Book item){
        return this.isbn - item.isbn;
    }
}
