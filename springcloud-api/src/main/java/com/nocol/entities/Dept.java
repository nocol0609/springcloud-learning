package com.nocol.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author liuxp
 * @version 1.0
 * @date 2019/8/25 15:43
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)  //链式风格访问，设置为true，则setter方法返回当前对象
public class Dept implements Serializable {

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
