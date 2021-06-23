package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    public void init(){
        //TODO
    	System.out.println("--------------------");
    	System.out.println("Init Globale");
    	this.calculator = new Calculator();
    }

    @Test
    public void should_add_two_numbers(){
       // TODO
    	int a = 5;
        int b = 3;
        int result = calculator.add(a,b);;
        Assertions.assertEquals(8, result);
    }
    
    @Test
    public void should_substract_two_numbers(){
        // TODO
    	int a = 6;
        int b = 4;
        int result = calculator.substract(a, b);
        Assertions.assertEquals(2, result); 	
    	
    }
    
    @Test
    public void should_multi_two_numbers(){
    	int a = 7;
        int b = 5;
        int result = calculator.multi(a, b);
        Assertions.assertEquals(40, result); 
    }
    
    @Test
    public void should_div_two_numbers(){
    	int a = 1;
        int b = 4;
        int result = calculator.div(a, b);
        Assertions.assertEquals(0.25, result); 
    }

    @Test
    public void should_add_tab(){
        int nmbers[] = {2,2,4,2,5};
        int result = calculator.add(nmbers);
        Assertions.assertEquals(15, result);
    }


}