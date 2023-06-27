package com.bmi;

import java.util.HashMap;
import java.util.Map;

public class IMCCalculator {

    private static final Map<Double, String> weightCategories = new HashMap<>();
    
    static {
        weightCategories.put(16.0, "Delgadez severa");
        weightCategories.put(17.0, "Delgadez moderada");
        weightCategories.put(18.5, "Delgadez leve");
        weightCategories.put(25.0, "Peso normal");
        weightCategories.put(30.0, "Sobrepeso");
        weightCategories.put(35.0, "Obesidad leve");
        weightCategories.put(40.0, "Obesidad moderada");
    }
    
    public double calculateBMI(double weight, double height) {
        double heightSquared = Math.pow(height, 2);
        return weight / heightSquared;
    }
    
   public String determineWeightCategory(double weight, double height) {
    double bmi = calculateBMI(weight, height);
    
    return (bmi < 16) ? "Delgadez severa" :
           (bmi < 17) ? "Delgadez moderada" :
           (bmi < 18.5) ? "Delgadez leve" :
           (bmi < 25) ? "Peso normal" :
           (bmi < 30) ? "Sobrepeso" :
           (bmi < 35) ? "Obesidad leve" :
           (bmi < 40) ? "Obesidad moderada" : "Obesidad morbida";
}


}
