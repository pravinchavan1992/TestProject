package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void TestClassadd(){
        System.out.print("Add Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30,a+b);
    }
    @Test
    public void TestClasssub(){
        System.out.print("sub Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(10,b-a);
    }
    @Test
    public void TestClassmul(){
        System.out.print("mul Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(200,a*b);
    }
}
