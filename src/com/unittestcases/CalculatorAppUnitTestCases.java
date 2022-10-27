package com.unittestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.application.Calculator;

public class CalculatorAppUnitTestCases {

@Test
    
    public void AddTwoNumbers()
    {
        Calculator calculatorApp = new Calculator();
        int ExpectedValue = 30;
        int ActualValue = calculatorApp.addCal(10, 20);
        Assert.assertEquals(ExpectedValue, ActualValue);
        
    }
    
    @Test
    
    public void AddTwoNumbersWithSecondValueAs0()
    {
        Calculator calculatorApp = new Calculator();
        int ExpectedValue = 10;
        int ActualValue = calculatorApp.addCal(10, 0);
        Assert.assertEquals(ExpectedValue, ActualValue);
        
    }
    
@Test
    
    public void AddTwoNumbersWithSecondValueAsString()
    {
        Calculator calculatorApp = new Calculator();
        String ExpectedValue = "Throw Error";
        //int ActualValue = calculatorApp.add(10, "");
        //Assert.assertEquals(ExpectedValue, ActualValue);
        
    }
    
    @Test
    
    public void WhenNumbersAreGreaterThanTwo()
    {
        Calculator.addCal("10,20,30");
        
    }
    
    @Test
    
    public void WhenOneNumberIsGiven()
    {
        Calculator.addCal("1");
    }


    public void MulTwoNumbers() 
  {
	
 }

}


