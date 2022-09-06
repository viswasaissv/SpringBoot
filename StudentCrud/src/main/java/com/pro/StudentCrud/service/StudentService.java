package com.pro.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.StudentCrud.dao.StudentDAO;
import com.pro.StudentCrud.entity.Student;

@Service
public class StudentService {
@Autowired
    private StudentDAO repo;
public List<Student> listAll() {
        return repo.findAll();
    }
    
    public void save(Student std) {
        repo.save(std);
    }
    
    public Student get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
}