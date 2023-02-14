package com.bandesal.demo.dao;

import com.bandesal.demo.models.Blogs;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class BlogDaoImp implements BlogDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Blogs> getBlogs() {
        String query = "FROM Blogs";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void delete(int id) {
        Blogs blog = entityManager.find(Blogs.class, id);
        entityManager.remove(blog);
    }

    @Override
    public void registerBlog(Blogs blogs) {
        entityManager.merge(blogs);
    }

}
