package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {
    @Test
    public void FirstTestCase(){
        System.out.println("I am the first test case");
    }
    @Test
    public void SecondTestCase(){
        System.out.println("I am the second test case");
    }
    @Test
    public void ThirdTestCase(){
        System.out.println("I am the third test case");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am a before method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am a after method");
    }
}
