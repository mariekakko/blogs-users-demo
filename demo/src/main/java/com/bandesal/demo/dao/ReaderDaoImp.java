package com.bandesal.demo.dao;

import com.bandesal.demo.models.Readers;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class ReaderDaoImp implements ReaderDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Readers> getReaders() {
        String query = "FROM Readers";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(int id) {
        Readers reader = entityManager.find(Readers.class, id);
        entityManager.remove(reader);
    }

    @Override
    public void register(Readers readers) {
        entityManager.merge(readers);
    }

}

