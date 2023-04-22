package com.QoraanAcademy.controller;

import com.QoraanAcademy.Service.TeacherService;
import com.QoraanAcademy.model.Teacher;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    private TeacherService teacherService;
    public TeacherController(TeacherService teacherService){
        super();
        this.teacherService=teacherService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>findById(@PathVariable String id){
        return ResponseEntity.ok(teacherService.findById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody @Valid Teacher entity){
        return ResponseEntity.ok(teacherService.update(entity));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id){
        teacherService.deleteById(id);
        return ResponseEntity.ok(null);
    }
    @GetMapping("")
public  ResponseEntity<?> findAll(){
        return ResponseEntity.ok(teacherService.findAll());
}
@PostMapping("")
public ResponseEntity<?> insert(@Valid @RequestBody Teacher entity){
          return ResponseEntity.ok(teacherService.insert(entity));
}
//public ResponseEntity<?>
   /* @GetMapping("/{email}")
public ResponseEntity<?> findByEmail(@PathVariable @Email String email){
return ResponseEntity.ok(teacherService.findByEmail(email));
}*/
}
