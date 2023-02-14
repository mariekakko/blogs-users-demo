package com.bandesal.demo.dao;

import com.bandesal.demo.models.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class UserDaoImp implements UserDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Users> getUsers() {
        String query = "FROM Users";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(int id) {
        Users user = entityManager.find(Users.class, id);
        entityManager.remove(user);
    }

    @Override
    public void register(Users users) {
        entityManager.merge(users);
    }

}
