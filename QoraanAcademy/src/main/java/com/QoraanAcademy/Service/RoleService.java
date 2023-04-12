package com.QoraanAcademy.Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public String getRole(String email, String password) {
        Query query = new Query();
        query.addCriteria(Criteria.where("email").is(email).and("password").is(password));
        User user = mongoTemplate.findOne(query, User.class);
        if (user != null) {
            return user.getRole();
        } else {
            return "invalid";
        }
    }
}