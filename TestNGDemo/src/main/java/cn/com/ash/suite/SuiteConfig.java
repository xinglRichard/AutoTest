package cn.com.ash.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行");
        System.out.println("after suite运行");
        System.out.println("after suite运行");
        System.out.println("after suite运行");
        System.out.println("after suite运行");
        System.out.println("after suite运行");
        System.out.println("after suite运行");














    }
}
