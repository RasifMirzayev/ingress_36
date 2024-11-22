package Overriding;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int intResult = calculator.add(4,5);
        System.out.println("<İnt Result> = " +intResult);

        double doubleResult = calculator.add(10.2, 20.2);
        System.out.println("<Double Result> = " +doubleResult);

        AdvancedCalculator advacedCalculator = new AdvancedCalculator();

        int advancedCalculator = calculator.add(4,5);
        System.out.println("<Advanced Result> = " + advancedCalculator);


    }
}
