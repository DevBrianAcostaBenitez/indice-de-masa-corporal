package com.bmi;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class IMCCalculatorTest {
    
    @Test
    public void extremeUnderweight() {
        IMCCalculator calculator = new IMCCalculator();
        String category1 = calculator.determineWeightCategory(40, 1.7);
        Assertions.assertEquals("Delgadez severa", category1);
    }
    @Test
    public void moderateUnderweigth() {
        IMCCalculator calculator = new IMCCalculator();
        String category2 = calculator.determineWeightCategory(47, 1.7);
        Assertions.assertEquals("Delgadez moderada", category2);
    }
    @Test
    public void  underweigth() {
        IMCCalculator calculator = new IMCCalculator();
        String category3 = calculator.determineWeightCategory(50, 1.7);
        Assertions.assertEquals("Delgadez leve", category3);
    }
    @Test
    public void NormalWeight() {
        IMCCalculator calculator = new IMCCalculator();
        String category4 = calculator.determineWeightCategory(55, 1.7);
        Assertions.assertEquals("Peso normal", category4);
    }
    @Test
    public void Overweight() {
        IMCCalculator calculator = new IMCCalculator();
        String category5 = calculator.determineWeightCategory(80, 1.7);
        Assertions.assertEquals("Sobrepeso", category5);
    } 
    @Test
    public void litteObesitiy() {
        IMCCalculator calculator = new IMCCalculator();
        String category6 = calculator.determineWeightCategory(95, 1.7);
        Assertions.assertEquals("Obesidad leve", category6);
    }
    @Test
    public void moderateObesiry() {
        IMCCalculator calculator = new IMCCalculator();
        String category7 = calculator.determineWeightCategory(110, 1.7);
        Assertions.assertEquals("Obesidad moderada", category7);
    }
    @Test
    public void morbidObesity() {
        IMCCalculator calculator = new IMCCalculator();
        String category8 = calculator.determineWeightCategory(130, 1.7);
        Assertions.assertEquals("Obesidad morbida", category8);
    }
    

}