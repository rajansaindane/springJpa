package com.example.rajan.Repository;

import com.example.rajan.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rajan on 13/2/17.
 */
public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{


    Employee findById(Integer id);


}
