package com.example.rajan.Controller;

import com.example.rajan.Domain.Employee;
import com.example.rajan.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rajan on 13/2/17.
 */
@RestController
public class employeeController

{
    @Autowired
   private EmployeeRepo employeeRepo;

    @RequestMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> savedata(@RequestBody Employee employee)
    {

        ResponseEntity<String> entity=null;
        employeeRepo.save(employee);

        entity= new ResponseEntity<String>("saved", HttpStatus.OK);
        return entity;
    }

    @RequestMapping(value = "/remove/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> removedata(@PathVariable Integer id)
    {

        ResponseEntity<String> entity=null;

       Employee emp= employeeRepo.findById(id);
        employeeRepo.delete(emp);
        String removed="Succesful removed";
        entity= new ResponseEntity<String>(removed, HttpStatus.OK);
        return entity;
    }

    @RequestMapping(value = "/update/{name}/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updatedata(@PathVariable String name,@PathVariable Integer id)
    {

        ResponseEntity<String> entity=null;

        Employee emp= employeeRepo.findById(id);
        emp.setName(name);
        employeeRepo.save(emp);
        String update="Succesful updated";
        entity= new ResponseEntity<String>(update, HttpStatus.OK);
        return entity;
    }

}
