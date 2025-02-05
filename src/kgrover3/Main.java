package kgrover3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        boolean notunknown = true;

        Scanner scanner = new Scanner(System.in);

        while (running) {

            System.out.println("What operation do you need? (+ - * /)");
            String operation = scanner.next();

            System.out.println("What is the first number?");
            float numberOne = scanner.nextFloat();
            System.out.println("What is the second number");
            float numberTwo = scanner.nextFloat();
            float result = 0;
            switch (operation){
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    result = numberOne / numberTwo;
                    break;
                default:
                    System.out.println("Unknown Operation Requested");
                    notunknown = false;

            }
            if (notunknown) {

                System.out.println(numberOne + " " + operation + " " + numberTwo + " = " + result);
            }

            System.out.println("Are you done? Y or N");
            String done = scanner.next();
            if (done.equals("Y") || done.equals("y")){
                running = false;
            }
        }
    }
}