package com.vti.Repository;

import com.vti.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

    //  @Query("FROM Department WHERE name = :name")
    //    Department abc(@Param("name")String name);

    @Query("FROM Department WHERE name = ?1")
    Department abc(String name);

    // Read: findBy
    //count: CountBy
    //Exist: existsBy
    //Delete: deleteBy


    List<Department> findByTotalMembersBetween(Integer minTotalMembers, Integer maxTotalMembers);

    @Modifying
    @Query("DELETE FROM Department WHERE name = :name")
    void deleteByName(@Param("name") String name);

}
