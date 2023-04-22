package com.QoraanAcademy.Repository;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.QoraanAcademy.model.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String>{

    MutablePropertyValues findById();
    @Query("{email:?0}")
    Teacher findByEmail(String email);
}
