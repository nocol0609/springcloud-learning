package com.nocol.service;

import com.nocol.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2020/8/4 13:11
 * @description ：
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientServiceFeign> {

    @Override
    public DeptClientServiceFeign create(Throwable throwable) {
        return new DeptClientServiceFeign() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID"+id+"没有对应信息，Cosumer客户端提供的降级信息，此刻服务Provider已经关闭")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return new ArrayList<>();
            }
        };
    }
}
