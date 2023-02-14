package com.bandesal.demo.controllers;

import com.bandesal.demo.dao.ReaderDao;
import com.bandesal.demo.models.Readers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReadersController {

    @Autowired
    private ReaderDao readerDao;
    @RequestMapping(value = "api/readers/{id}")
    public Readers getReader(@PathVariable Integer id){
        Readers reader = new Readers();
        reader.setId(id);
        reader.setName("Lucas");

        return reader;
    }

    @RequestMapping(value = "api/readers", method = RequestMethod.GET)
    public List<Readers> getReader(){
        return readerDao.getReaders();

    }
    @RequestMapping(value = "api/readers", method = RequestMethod.POST)
    public void registerReader(@RequestBody Readers readers){
        readerDao.register(readers);
    }
    @RequestMapping(value = "readers1")
    public Readers editReaders(){
        Readers readers = new Readers();
        readers.setName("Lucas");

        return readers;
    }

    @RequestMapping(value = "api/readers/{id}", method = RequestMethod.DELETE)
    public void deleteReaders(@PathVariable int id){
        readerDao.delete(id);

    }

    @RequestMapping(value = "readers3")
    public Readers searchReaders(){
        Readers readers = new Readers();
        readers.setName("Lucas");

        return readers;
    }
}
