import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialise variables
        Scanner scanner2 = new Scanner(System.in);
        boolean cont = false;

        // Calculator loop for multiple use
        do{
            prep();
            System.out.println("Do you want to make another calculation? y or n");
            String another = scanner2.next().toLowerCase();
            if(another.equals("y")){
                cont = true;
            }

        } while (cont);
    };

    // Function that gets operands and operator
    static void prep(){
        boolean same = false;
        Scanner scanner = new Scanner(System.in);
        double first_number = 0;

        do {
            System.out.println("What's the first_number number?");
            first_number = scanner.nextDouble();
        } while (!same);

        System.out.println("Whats the operation? + - * / ");
        String op = scanner.next();

        System.out.println("What's the second number?");
        double second_number = scanner.nextDouble();

        double result = calculations(first_number, second_number, op);
        System.out.printf("%.2f %s %.2f = %.2f\n", first_number, op, second_number, result);

        // calculate using previous results
        System.out.println("Do you want to calculate with the results? y or n");
        String continued_result = scanner.next();
        if(continued_result.equals("y")) same = true;

    }

    // Calculation function
    static double calculations(double x, double y, String operation){
        double result = 0;
        switch(operation){
            case "+": result = x + y;
            break;
            case "-": result = x - y;
            break;
            case "*": result = x * y;
            break;
            case "/": result = x / y;
            break;
            default:
                System.out.println("Not a valid operation");
        }
        return result;
    };
}

