package BMICalculatior;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weightKg;
        double heightMetres;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your weight in Kg:");
        weightKg =scanner.nextDouble();

        System.out.print("Enter your height in kg:");
        heightMetres=scanner.nextDouble();

        double result=weightKg/Math.pow(heightMetres,2);

        if (result<18.5){
            System.out.println("Your BMI is " + result + ",You are underweight");
        }else if (result >= 18.5 && result <24.9){
            System.out.println("Your BMI is " + result + " Your weight is normal");
        }else  if (result >= 25 && result < 30)
        {
            System.out.println("Your BMI is " + result + ",You are overweight");
        }else
        {
            System.out.println("Your BMI is " + result + ",Please start eating healthy food");
        }


        /*BMI Categories:
        Underweight = <18.5kg
        Normal weight = 18.5 -24.9kg
        Overweight= 25-29.9kg
        Obesity=BMI of 30 0r greater
        */

    }


}
