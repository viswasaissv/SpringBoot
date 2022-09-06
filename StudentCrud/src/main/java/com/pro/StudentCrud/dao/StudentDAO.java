package com.pro.StudentCrud.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pro.StudentCrud.entity.*;
@Repository
public interface StudentDAO extends JpaRepository< Student, Long>{

}
