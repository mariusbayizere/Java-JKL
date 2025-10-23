package LeetcodeQuestion;

import java.util.Scanner;

public class FactorialNumber {

    static  int Factorial = 1;
    static  int startIndex = 1;

    static  void FactorialNumber(int Number){

        if (Number == 0){
            System.out.println(" Zero Number is not in the part of Factorail Must start from 1");

        }
        else{

            for(; startIndex <= Number ; startIndex++) {
                Factorial = Factorial * startIndex;
                System.out.println("The factorial Number is "+ Factorial);
            }


        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Provide Factorial Numbers :");
        int Number = scanner.nextInt();
        FactorialNumber(Number);
    }
}
