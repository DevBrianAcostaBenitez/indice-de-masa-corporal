package com.bmi;

public class IMCCalculator {
    
    public double calculateBMI(double weight, double height) {
        double heightSquared = Math.pow(height, 2);
        return weight / heightSquared;
    }
    
    public String determineWeightCategory(double weight, double height) {
        double bmi = calculateBMI(weight, height);
         if (bmi < 16) {
            return "Delgadez severa";
        } else if (bmi >= 16 && bmi < 17) {
            return "Delgadez moderada";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Delgadez leve";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Peso normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesidad leve";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad morbida";
        }
    }
}