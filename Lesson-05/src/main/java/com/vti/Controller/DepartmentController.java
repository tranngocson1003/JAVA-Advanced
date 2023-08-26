package com.vti.Controller;

import com.vti.Entity.Department;
import com.vti.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@CrossOrigin
public class DepartmentController implements IDepartmentController {

    @Autowired
    private IDepartmentService service;

    @Override
    @GetMapping
    public Page<Department> findAll(Pageable pageable){
        return service.findAll(pageable);
    }

    @Override
    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @Override
    @GetMapping("/name/{name}")
    public Department findByName(@PathVariable("name") String name) {
        return service.findByName(name);
    }
    @Override
    @PostMapping
    public void create(@RequestBody Department department){
        service.create(department);
    }
    @Override
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Department department){
        department.setId(id);
        service.update(department);
    }
    @Override
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        service.deleteById(id);
    }

    @Override
    @DeleteMapping("/name/{name}")
    public void deleteByName(@PathVariable("name") String name) {
        service.deleteByName(name);
    }
}
