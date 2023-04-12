package com.QoraanAcademy.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.QoraanAcademy.model.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String>{

}
