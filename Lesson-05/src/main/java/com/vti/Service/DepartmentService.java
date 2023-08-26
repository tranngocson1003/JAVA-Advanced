package com.vti.Service;

import com.vti.Entity.Department;
import com.vti.Repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepository repository;


//    @Autowired
//    private ObjectWriter writer;

    @Override
    public Page<Department> findAll(Pageable pageable) {
        return repository.findAll(pageable );
    }


    @Override
    public Department findById(Integer id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public Department findByName(String name) {
        return repository.abc(name);
    }

    @Override
    public void create(Department department) {
        repository.save(department);
    }

    @Override
    public void update(Department department){
        repository.save(department);
    }

    @Override
    public void deleteById(Integer id){
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteByName(String name) {
        repository.deleteByName(name);
    }


}
