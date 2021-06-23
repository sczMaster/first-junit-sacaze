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
        int result = a+b;
        Assertions.assertEquals(result, calculator.add(a,b));
    }
    
    @Test
    public void should_substract_two_numbers(){
        // TODO
    	int a = 6;
        int b = 4;
        int result = a-b;
        Assertions.assertEquals(result, calculator.substract(a, b)); 	
    	
    }
    
    @Test
    public void should_multi_two_numbers(){
    	int a = 7;
        int b = 5;
        int result = a*b;
        Assertions.assertEquals(result, calculator.multi(a, b)); 
    }
    
    @Test
    public void should_div_two_numbers(){
    	int a = 1;
        int b = 4;
        int result = a/b;
        Assertions.assertEquals(result, calculator.div(a, b)); 
    }

    @Test
    public void should_add_tab(int adds){
        int nmbers[] = {5,2,9,2,4};
        System.out.println("La somme des éléments du tableau est : "+ adds);
        Assertions.assertEquals(adds,calculator.add(nmbers));
    }


}