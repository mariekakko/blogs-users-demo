package com.bandesal.demo.dao;

import com.bandesal.demo.models.Readers;

import java.util.List;

public interface ReaderDao {
    List<Readers> getReaders();

    void delete(int id);

    void register(Readers readers);
}
