import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user1 weight in pounds: ");
         double weightInPounds1 = scanner.nextDouble();

        System.out.println("Enter user1 height in inches: ");
         double heightInInches1 = scanner.nextDouble();

         double bmi1 = weightInPounds1 / (heightInInches1 * heightInInches1) * 703;


        System.out.println("Enter user2 weight in pounds: ");
        double weightInPounds2 = scanner.nextDouble();

        System.out.println("Enter user2 height in inches: ");
        double heightInInches2 = scanner.nextDouble();

        double bmi2 = weightInPounds1 / (heightInInches2 * heightInInches2) * 703;


        System.out.println("BMI of user 1: " +bmi1);
        System.out.println("BMI of user 2: " +bmi2);
    }
}
