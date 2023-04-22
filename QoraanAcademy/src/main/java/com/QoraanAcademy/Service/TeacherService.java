package com.QoraanAcademy.Service;

import com.QoraanAcademy.Repository.TeacherRepository;
import com.QoraanAcademy.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
private TeacherRepository teacherRepository;
    public Teacher findById(String id){
return teacherRepository.findById(id).get();
    }
   public List<Teacher> findAll(){
        return teacherRepository.findAll();
   }
   public Teacher insert(Teacher entity){
        if(entity.getId()!=null){
            throw new RuntimeException();
        }
        return teacherRepository.insert(entity);

   }
   public Teacher update(Teacher entity){
        Teacher teacher= findById(entity.getId());
        teacher.setFirstName(entity.getFirstName());
        teacher.setLastName(entity.getLastName());
        teacher.setMaximumNumberOfStudents(entity.getMaximumNumberOfStudents());
        teacher.setAge(entity.getAge());
        teacher.setAvailableTimeFoSession(entity.getAvailableTimeFoSession());
        teacher.setEmail(entity.getEmail());
        teacher.setGander(entity.getGander());
        return teacherRepository.save(teacher);
   }
   public List<Teacher >  insertAll(List<Teacher>  entity) {
        return teacherRepository.saveAll(entity);
   }
   public void deleteById(String id){
         teacherRepository.deleteById(id);
   }
   public   Teacher findByEmail(String email){
        return teacherRepository.findByEmail(email);
   }
}
