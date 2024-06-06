package controller;

import service.book.BookService;
import service.book.IBookService;

public class BookController {
    private IBookService bookService = BookService.getInstance("KA");

//    public static void main(String[] args) {
//        BookService bookService1 = BookService.getInstance("KA");
//        System.out.println(bookService1);
//        BookService bookService2 = BookService.getInstance("Dung");
//        System.out.println(bookService2);
//    }
}
