package com.alison;


import com.alison.vo.BlogPO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ApplicationTest {


    private static final Logger log = LoggerFactory.getLogger(ApplicationTest.class);

    @Autowired
    public BlogPO blogPO;

    @Test
    public void test01() throws Exception {
        Assert.assertEquals("alison", blogPO.getName());
        System.out.println(blogPO.getTitle());
        Assert.assertEquals("乐死我了", blogPO.getTitle());
        Assert.assertEquals("alison,上车兜风", blogPO.getDesc());
        System.out.println("blogPO.bigNumber()="+blogPO.getBigNumber());
        System.out.println("blogPO.value="+blogPO.getValue());
        System.out.println("number="+blogPO.getNumber());
        System.out.println("extend_1="+blogPO.getExtend_1());
        System.out.println("extend_2="+blogPO.getExtend_2());
    }
}
