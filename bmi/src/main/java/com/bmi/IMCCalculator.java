package com.bmi;


public class IMCCalculator {

   
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
