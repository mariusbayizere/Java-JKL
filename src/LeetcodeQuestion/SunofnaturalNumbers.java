package LeetcodeQuestion;

import java.util.Scanner;

public class SunofnaturalNumbers {

   static int sum;

  public static void sumofnaturalNumber(int number) throws  InterruptedException{
      if (number <= 0){
          System.out.println("Invalid Number!!");
          Thread.sleep(1000);
          System.out.println("Please Provide Number above 0 must start from 1");
      }
      else
      {
          for (int i = 1; i <= number; i++){
              sum =  sum + i;
          }
          System.out.println("The sum of natural numbers are :"+ sum);
      }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Numbers..");
        int number = scanner.nextInt();
        sumofnaturalNumber(number);
    }
}
