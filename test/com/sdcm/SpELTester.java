package com.sdcm;

import config.RunTimeValueConfig;
import config.SpELConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Administrator on 2017/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpELConfig.class)
//@ContextConfiguration(locations = "classpath*:/rules/SpEL.xml")
public class SpELTester {
    //private String string;

    @Autowired
    private SpEL spEL;
//    @Autowired
//    private Aop aopImp;

    @Test
    public void testSpEL() {
        spEL.show();
    }

//    @Test
//    public void testAopImp(){
//        aopImp.aopShow();
//    }
}
