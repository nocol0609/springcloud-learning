package com.nocol.service;

import com.nocol.entities.Dept;

import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2019/8/25 17:30
 */
public interface IDeptService
{
	public boolean  add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
