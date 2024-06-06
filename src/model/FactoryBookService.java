package model;

import model.Book;
import model.FBook;
import model.PB;

public class FactoryBookService {
    FactoryBookService() {
    }
    private static FactoryBookService instance;

    public static FactoryBookService getInstance() {
        if (instance==null)
            instance = new FactoryBookService();
        return instance;
    }

    public Book getBook(TypeBook type){
////        neu P -> PB
//        if (type.equals("P")){
//            return new PB();
//        }
////        F -> FB
//        else {
//            return new FBook();
//        }
        switch (type){
            case FICTIONBOOK:
                return new FBook();
            case PROGRAMMINGBOOK:
                return new PB();
            default:
                throw new IllegalArgumentException();
        }
    }
}
