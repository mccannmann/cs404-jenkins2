import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter Calculator Function:");
        Scanner input = new Scanner(System.in);
        String inputText = "";

        while (!inputText.equals("q")) {
            inputText = input.next();
            switch (inputText) {
                case "add": {
                    int num1 = Integer.parseInt(input.next());
                    int num2 = Integer.parseInt(input.next());

                    String result = Integer.toString(calculator.add(num1, num2));
                    System.out.println(result);
                    break;
                }
                case "subtract": {
                    int num1 = Integer.parseInt(input.next());
                    int num2 = Integer.parseInt(input.next());

                    String result = Integer.toString(calculator.subtract(num1, num2));
                    System.out.println(result);
                    break;
                }
                case "multiply": {
                    int num1 = Integer.parseInt(input.next());
                    int num2 = Integer.parseInt(input.next());

                    String result = Integer.toString(calculator.multiply(num1, num2));
                    System.out.println(result);
                    break;
                }
                case "divide": {
                    int num1 = Integer.parseInt(input.next());
                    int num2 = Integer.parseInt(input.next());

                    String result = Integer.toString(calculator.divide(num1, num2));
                    System.out.println(result);
                    break;
                }
                case "fibonacci":
                case "f": {
                    int num1 = Integer.parseInt(input.next());

                    String result = Integer.toString(calculator.fibonacciNumberFinder(num1));
                    System.out.println(result);
                    break;
                }
                case "binary":
                case "b": {
                    int num1 = Integer.parseInt(input.next());

                    String result = calculator.intToBinaryNumber(num1);
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
