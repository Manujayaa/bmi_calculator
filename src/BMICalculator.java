public class BMICalculator {
    public double calculatorBmiImperial(double weightInPounds, double heightInInches) {


        return weightInPounds / (heightInInches * heightInInches) * 703;
    }

    public double calculatorBmiMetric(double weightInKilo, double heightInMeters) {


        return weightInKilo / (heightInMeters * heightInMeters);
    }
}