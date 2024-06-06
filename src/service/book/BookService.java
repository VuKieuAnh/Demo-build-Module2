package service.book;

import model.Book;
import model.FactoryBookService;
import model.TypeBook;

import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService {
    private ArrayList<Book> arrayList = new ArrayList<>();
    private FactoryBookService factoryBookService = FactoryBookService.getInstance();
    private String name;

    private BookService(String name) {
        this.name = name;
    }

    private static BookService instance;
    public static BookService getInstance(String name){
        if (instance == null){
            instance = new BookService(name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "name='" + name + '\'' +
                '}';
    }

    public void create(){
        Book book = factoryBookService.getBook(TypeBook.FICTIONBOOK);
        arrayList.add(book);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
