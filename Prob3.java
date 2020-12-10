import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args) {
    
    Scanner scan= new Scanner(System.in);
    // Prompt the user to enter weight in pounds
    System.out.println("Enter weight in pounds: ");
    int weight= scan.nextInt();

    // Prompt the user to enter height in inches
    System.out.println("Enter height ");
    int height= scan.nextInt();

    
    //Constant
    final double KILOGRAMS_PER_POUND = 0.45359237; 
    final double METERS_PER_INCH = 0.0254; 
    
    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double BMI = weightInKilograms/(heightInMeters * heightInMeters);

    // Display result using if, else if and else
   if (BMI <18.5)
   {
     System.out.println("Underweight");
   }
   else if(BMI > 18.5 || BMI < 25.0)
  {
    System.out.println("Normal");
  }
   else if(BMI < 25.0 || BMI > 30.0)
  {
    System.out.println("Overweight");
  }
  else{
    System.out.println("Obese");
  }
  }
}