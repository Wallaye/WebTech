package laba1.task15;

import laba1.task15.comporators.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args){
        Comparator<Book> titleCmp = new TitleComparator();
        Comparator<Book> titleAuthorCmp =
                new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleCmp =
                new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> titleAuthorPriceCmp =
                new TitleComparator().thenComparing(new AuthorComparator()).thenComparing(new PriceComparator());

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("A", "B", 100, 123));
        list.add(new Book("B", "B", 120, 124));
        list.add(new Book("AB", "A", 50, 32));
        list.add(new Book("C", "C", 130, 1123));
        list.add(new Book("BAC", "C", 89, 4214));

        list.sort(titleCmp);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(titleAuthorCmp);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(titleAuthorPriceCmp);
        System.out.println(Arrays.toString(list.toArray()));
        list.sort(authorTitleCmp);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
