package com.bmi;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class IMCCalculatorTest {
    
    @Test
    public void testDetermineWeightCategory() {
        IMCCalculator calculator = new IMCCalculator();
       
        String category1 = calculator.determineWeightCategory(40, 1.7);
        Assertions.assertEquals("Delgadez severa", category1);
        

        String category2 = calculator.determineWeightCategory(47, 1.7);
        Assertions.assertEquals("Delgadez moderada", category2);
        
        String category3 = calculator.determineWeightCategory(50, 1.7);
        Assertions.assertEquals("Delgadez leve", category3);
        
        String category4 = calculator.determineWeightCategory(55, 1.7);
        Assertions.assertEquals("Peso normal", category4);
        
        String category5 = calculator.determineWeightCategory(80, 1.7);
        Assertions.assertEquals("Sobrepeso", category5);
        
        String category6 = calculator.determineWeightCategory(95, 1.7);
        Assertions.assertEquals("Obesidad leve", category6);
        
        String category7 = calculator.determineWeightCategory(110, 1.7);
        Assertions.assertEquals("Obesidad moderada", category7);
        
        String category8 = calculator.determineWeightCategory(130, 1.7);
        Assertions.assertEquals("Obesidad morbida", category8);
    }
}