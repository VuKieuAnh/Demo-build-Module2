package service;

import java.util.List;

public interface IGenerateService<T> {
    void create();
    void delete(int id);
    List<T> findAll();
}
