package com.gtxc.practice.bookordering;

/*
    Created by gt at 3:18 AM on Monday, February 21, 2022.
    Project: practice, Package: com.gtxc.practice.bookordering.
*/

import java.util.*;
import java.util.stream.Collectors;

public class BookMain {

    public static void main(String[] args) {

        Set<Book> bookShelf = new HashSet<>();
        bookShelf.add(new Book("The C Programming Language", 288, "Dennis M. Ritchie, Ken Thompson", 1972));
        bookShelf.add(new Book("Design Patterns", 395, "Erich Gamma, John Vlissides, Richard Helm, Ralph Johnson", 1994));
        bookShelf.add(new Book("Fight Club", 208, "Chuck Palahniuk", 1996));
        bookShelf.add(new Book("RTFM: Red Team Field Manual", 96, "Ben Clark", 2014));
        bookShelf.add(new Book("BTFM: Blue Team Field Manual", 134, "Alan White, Ben Clark", 2017));

        Iterator<Book> bookIterator = bookShelf.iterator();
        System.out.println("Unsorted books in the shelf:");
        while (bookIterator.hasNext()) {
            System.out.println(bookIterator.next());
        }

        System.out.println();

        Set<Book> sortedShelf = new TreeSet<>(Book::compareTo);
        sortedShelf.addAll(bookShelf);
        System.out.println("Sorted books in the shelf:");
        for (Book book : sortedShelf) {
            System.out.println(book);
        }

        List<Book> bookList = new ArrayList<>(bookShelf);
        bookList.add(new Book("Java", 100, "dummy1", 2022));
        bookList.add(new Book("Javascript", 150, "dummy2", 2022));
        bookList.add(new Book("SQL", 200, "dummy3", 2022));
        bookList.add(new Book("Spring Boot", 250, "dummy4", 2022));
        bookList.add(new Book("GoLang", 300, "dummy5", 2022));

        Map<String, String> bookAuthor = new HashMap<>();
        bookList.forEach(book -> bookAuthor.put(book.getTitle(), book.getAuthor()));

        List<Book> bookPagesGreaterThan100 = bookList.stream().filter(book -> book.getNumberOfPages() > 100).collect(Collectors.toList());
    }
}
