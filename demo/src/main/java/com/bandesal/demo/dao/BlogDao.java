package com.bandesal.demo.dao;
import com.bandesal.demo.models.Blogs;
import com.bandesal.demo.models.Readers;

import java.util.List;
public interface BlogDao {

    List<Blogs> getBlogs();

    void delete(int id);

    void registerBlog(Blogs blog);

}
