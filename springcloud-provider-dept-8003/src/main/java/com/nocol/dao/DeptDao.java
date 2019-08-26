package com.nocol.dao;

import com.nocol.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2019/8/25 17:14
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
