package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Author;
import org.ulpgc.is1.model.Book;
import org.ulpgc.is1.model.BookCatalog;
import org.ulpgc.is1.model.Subject;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog();
        init(catalog);
        System.out.println(catalog.getBook(0).getTitle());
        System.out.println(catalog.getBook(1).getAuthor().getName());
        System.out.println(catalog.bookCount());
        catalog.removeBook(0);
    }
    private static void init(BookCatalog catalog) {
        catalog.addBook("title1", "editor1", 2002, Subject.Novel, new Author("name1", "surname1"));
        catalog.addBook("title2", "editor2", 2003, Subject.Novel, new Author("name2", "surname2"));
        catalog.addBook("title3", "editor3", 1910, Subject.Novel, new Author("name3", "surname3"));
    }
}
