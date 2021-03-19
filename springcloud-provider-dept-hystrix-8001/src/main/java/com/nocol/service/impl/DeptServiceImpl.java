package com.nocol.service.impl;

import com.nocol.dao.DeptDao;
import com.nocol.entities.Dept;
import com.nocol.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2019/8/25 17:30
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
