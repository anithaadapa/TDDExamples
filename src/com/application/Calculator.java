package com.application;

public class Calculator {

	//req1 to add two numbers
	
    public static int addCal(int num1, int num2)
    {
        
        int sum = num1+num2;
        return sum;
       

    }
    
   
    //Req 1.1 For Addition you need accept two numbers with comma seperated
    public static void addCal(String numbers)
    {
        
        String[] numArray = numbers.split(",");
        if(numArray.length>2)
        {
            System.out.println("The Input values are having more than 2 numbers");
        }
        else 
        {
            for(String number:numArray)
            {
                Integer.parseInt(number);
            }
        }

    }

    
    //Req2
    
    public static int mul()
    {
        return 0;
        
    }


	
	
}
