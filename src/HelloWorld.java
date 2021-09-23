import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {
        int x = 14;
        int y = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("x%y = " + x%y); // % -> remainder uldegdliig oldog operator
        System.out.println("x/y = " + x/y);
        System.out.println("------------------");

        double num1, num2;
        String op;
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Second number: ");
        num2 = input.nextDouble();

        System.out.print("Which operator you want to do? (+-*/):");
        op = input.next();

        if(op.equals("+")){
            System.out.println("Sum of two number is : " +(num1+num2));
        }else if (op.equals("-")){
            System.out.println("difference og two number is : " + (num1-num2));
        }else if (op.equals("/")){
            System.out.println("num1/num2 = " + (num1/num2));
        }else if (op.equals("*")){
            System.out.println("multiple of two number: "+ (num1*num2));
        }else{
            System.out.println("Error You haven't entered a valid operator!!" );
        }











    }

}

