package com.alison;

import com.alison.action.ConfigApplication;
import com.alison.action.config.BookComponent;
import com.alison.action.config.BookProperties;
import com.alison.action.config.EmailPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ConfigApplication.class)
public class ApplicationTest {

    @Autowired
    private EmailPO emailPO;


    @Autowired
    private BookProperties bookProperties;



    @Autowired
    private BookComponent bookComponent;

    @Test
    public void testBookComponent(){
        System.out.println(bookComponent);
    }

    @Test
    public void test02(){
        System.out.println(bookProperties.getName());
        System.out.println(bookProperties.getWriter());
    }
    @Test
    public void test01() {
        System.out.println(emailPO);
        System.out.println(emailPO.getServer());
        System.out.println(emailPO.getPort());
        System.out.println(emailPO.getUsername());
        System.out.println(emailPO.getPassword());
    }
}
