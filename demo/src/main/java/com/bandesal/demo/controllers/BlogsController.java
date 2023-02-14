package com.bandesal.demo.controllers;

import com.bandesal.demo.dao.BlogDao;
import com.bandesal.demo.models.Blogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BlogsController {

    @Autowired
    private BlogDao blogDao;
    @RequestMapping(value = "api/blogs/{id}")
    public Blogs getBlog(@PathVariable Integer id){
        Blogs blog = new Blogs();
        blog.setId(id);
        blog.setDescription("BLOG DESC");

        return blog;
    }

    @RequestMapping(value = "api/blogs", method = RequestMethod.GET)
    public List<Blogs> getBlog(){
        return blogDao.getBlogs();

    }
    @RequestMapping(value = "api/blogs", method = RequestMethod.POST)
    public void registerBlog(@RequestBody Blogs blogs){
        blogDao.registerBlog(blogs);
    }

    @RequestMapping(value = "api/blogs/{id}", method = RequestMethod.DELETE)
    public void deleteBlogs(@PathVariable int id){
        blogDao.delete(id);

    }

}
