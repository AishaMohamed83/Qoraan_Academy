package com.QoraanAcademy.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.QoraanAcademy.model.Student;

@Repository
public class RoleRepository extends MongoRepository<Role, String>{

}
