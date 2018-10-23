import java.util.Scanner;

public class SciCalculator
{
    public static void main(String[] args)
    {
        //First we define and initialize the variables
        int menuSelection = 1;
        double currentResult = 0.0;
        double firstOperand;
        double secondOperand;
        int numOfCalculations = 0;
        double sumOfCalculations = 0;
        double average = 0;

        Scanner input = new Scanner (System.in);

        /*We want the program to terminate when the input is 0, so we set the while loop
        to continue to run unless the input it 0*/
        while (menuSelection != 0)
        {
            System.out.println("Current Result: " + currentResult + "\n");
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average\n");

            /*The do-while loop is used so that the menu only reprints after a calculation
            (options 1-6)*/
            do
            {
                System.out.print("Enter Menu Selection: ");
                menuSelection = input.nextInt();

                switch (menuSelection)
                {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = firstOperand + secondOperand;
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = firstOperand - secondOperand;
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = firstOperand * secondOperand;
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = firstOperand / secondOperand;
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = Math.pow(firstOperand, secondOperand);
                        System.out.println(" ");
                        break;
                    case 6:
                        System.out.print("Enter first operand: ");
                        firstOperand = input.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = input.nextDouble();
                        currentResult = Math.log(secondOperand) / Math.log(firstOperand);
                        System.out.println(" ");
                        break;
                    case 7:
                        /*The if/else statement is used so that statistics only print when there has been
                        at least 1 calculation*/

                        if (numOfCalculations == 0) System.out.println(" \nError: No calculations yet to average!\n");

                        else
                        {
                            System.out.println("\nSum of calculations: " + sumOfCalculations);
                            System.out.println("Number of calculations: " + numOfCalculations);
                            System.out.println("Average of calculations: " + average + "\n");
                        }
                        break;
                    default:
                        System.out.println("\nError: Invalid selection!\n");
                }

                /*We only want calculations to contribute to the statistics. This if statement
                will only consider valid inputs that are 1-6 in the statistics*/
                if (menuSelection <= 6 && menuSelection >= 1)
                {
                    numOfCalculations++;
                    sumOfCalculations += currentResult;
                    average = sumOfCalculations / numOfCalculations;
                    average = (average * 100);
                    average = Math.round(average);
                    average = average / 100;
                }
            }
            /* This condition statement for the do while loop shows that we do not want the
            menu reprinted after the statistics or an error statement is printed*/
            while (menuSelection >= 7 || menuSelection < 0);
        }
        System.out.println(" \nThanks for using this calculator. Goodbye!");
    }


}

