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
    	int a = 5, b = 6, result = a +b;
    	Assertions.assertEquals(result, Calculator.add(a,b));
    }
    
    @Test
    public void should_substract_two_numbers(){
        // TODO
    	int a = 8, b = 6,result = a -b;
    	Assertions.assertEquals(result, Calculator.substract(a,b));
    }


}