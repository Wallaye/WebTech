package laba1.task15;

public class Book {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPrice(){
        return this.price;
    }

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
        return "Author: " + author + " Title: " + title + " Price: " + price;
    }
}
