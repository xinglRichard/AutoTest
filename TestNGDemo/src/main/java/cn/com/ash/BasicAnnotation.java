package cn.com.ash;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before执行");
    }
    @Test
    public void testCase1(){
     System.out.println("执行测试用例1");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("After执行");
    }
}
