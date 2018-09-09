package fgo.saber.ex.auth.T;

import fgo.saber.ex.auth.AuthApplicationTests;
import fgo.saber.ex.auth.dao.DeptMapper;
import fgo.saber.ex.auth.model.entity.Dept;
import org.junit.Test;

import javax.annotation.Resource;

public class T1 extends AuthApplicationTests {

    @Resource
    private DeptMapper deptMapper;

    @Test
    public void t1() {
        Dept dept = deptMapper.selectByPrimaryKey(1L);
        System.out.printf(dept.getName());
    }

}
