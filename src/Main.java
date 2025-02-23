import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         BMICalculator bmiCalculator = new BMICalculator();

        System.out.println("Enter user weight in pounds: ");
         double weightInPounds = scanner.nextDouble();

        System.out.println("Enter user height in inches: ");
         double heightInInches = scanner.nextDouble();

         double bmiImperial = bmiCalculator.calculatorBmiImperial(weightInPounds,heightInInches);


        System.out.println("Enter user weight in Kilo: ");
        double  weightInKilo = scanner.nextDouble();

        System.out.println("Enter user height in Meters: ");
        double heightInMeters = scanner.nextDouble();

        double bmiMetric = bmiCalculator.calculatorBmiMetric(weightInKilo,heightInMeters);


        System.out.println("BMI in Imperial System: " +bmiImperial);
        System.out.println("BMI of user 2: " +bmiMetric);
    }
}
