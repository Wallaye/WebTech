package laba1.task15.comporators;

import laba1.task15.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b){
        return a.getAuthor().compareTo(b.getAuthor());
    }
}
