package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
    @Test
    public void TestClass2add(){
        System.out.print("Add Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(30,a+b);
    }
    @Test
    public void TestClass2sub(){
        System.out.print("sub Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(10,b-a);
    }
    @Test
    public void TestClass2mul(){
        System.out.print("mul Method");
        int a = 10;
        int b = 20;
        Assert.assertEquals(200,a*b);
    }
}
