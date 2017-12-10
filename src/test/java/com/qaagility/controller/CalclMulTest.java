package com.qaagility.controller;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class CalcMulTest {
  CalcMul myCal = new CalcMul();
@Before  
  public void testSlow() {
     System.out.println("slow");
  }
 
@After
public void testSlower() {
     System.out.println("slower");
  }
/*
public void testFast() {
     System.out.println("fast-updated");
  }
  */
 @Test
    public void testCalc(){
      assertEquals("DJ",18,myCal.multiply(3,6));
      assertEquals("DJ",1800,myCal.multiply(30,60));
      assertEquals("DJ",90,myCal.multiply(3,30));
    }
}
