package com.alison;

import com.alison.po.PersonPo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = {"classpath:haha.xml"})
public class PoTest {
    @Autowired
    ApplicationContext ctx;

    @Test
    public void test02(){
        PersonPo p = (PersonPo)ctx.getBean("person");
        System.out.println(p.getName());
    }
}
