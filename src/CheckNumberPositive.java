import java.util.Scanner;

public class CheckNumberPositive {

    static int choice;

    /**
     *
     * @param Number1
     * @param Number2
     * @return: Sum of two numbers
     */
    public  static int AddTwoNumber(int Number1, int Number2){
        return Number1 + Number2;
    }

    /**
     *
     * @param Number1
     * @param Number2
     * @return: sub
     */
    public  static int SubTwoNumber(byte Number1, byte Number2){
        return Number1 - Number2;
    }

    /**
     *
     * @param Number1
     * @param Number2
     * @return: product of two numbers
     */
    public  static int MultiplicationTwoNumber(int Number1, int Number2){
        return Number1 * Number2;
    }

    /**
     *
     * @param Number1
     * @param Number2
     * @return: Remenders
     */
    public  static int ModuleTwoNumber(byte Number1, byte Number2){
        return Number1 % Number2;
    }

    /**
     *
     * @param Number1
     * @param Number2
     * @return: Result from Divsion of two number
     */
    public  static int DivsiionTwoNumber(byte Number1, byte Number2){
        return Number1 / Number2;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("_________________________________________________");
            System.out.println("PLEASE MAKE CHOICE OF CALCULATOR YOU WANT TO MAKE");
            System.out.println("CHOICE 1. FOR ADDITION");
            System.out.println("CHOICE 2. FOR SUBSTRACTION");
            System.out.println("CHOICE 3. FOR MULTIPLICATION");
            System.out.println("CHOICE 4. FOR DIVISION");
            System.out.println("CHOICE 5. FOR MODULUS");
            System.out.println("_________________________________________________");


            Scanner scanner = new Scanner(System.in);
            CheckNumberPositive.choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("PLEASE ENTER NUMBER 1");
                int a = scanner.nextByte();
                System.out.println("PLEASE ENTER NUMBER 2");
                int b = scanner.nextByte();

                System.out.println("The sum of two Numbers is : " + CheckNumberPositive.AddTwoNumber(a, b));

            }


            if (choice == 2) {
                System.out.println("PLEASE ENTER NUMBER 1");
                byte a = scanner.nextByte();
                System.out.println("PLEASE ENTER NUMBER 2");
                byte b = scanner.nextByte();
                System.out.println("The SUB of two Numbers is : " + CheckNumberPositive.SubTwoNumber(a, b));

            }

            if (choice == 3) {
                System.out.println("PLEASE ENTER NUMBER 1");
                int a = scanner.nextByte();
                System.out.println("PLEASE ENTER NUMBER 2");
                int b = scanner.nextByte();
                System.out.println("The Product of two Numbers is : " + CheckNumberPositive.MultiplicationTwoNumber(a, b));
            }

            if (choice == 4) {
                System.out.println("PLEASE ENTER NUMBER 1");
                byte a = scanner.nextByte();
                System.out.println("PLEASE ENTER NUMBER 2");
                byte b = scanner.nextByte();
                System.out.println("The DIVISION of two Numbers is : " + CheckNumberPositive.DivsiionTwoNumber(a, b));
            }

            if (choice == 5) {
                System.out.println("PLEASE ENTER NUMBER 1");
                byte a = scanner.nextByte();
                System.out.println("PLEASE ENTER NUMBER 2");
                byte b = scanner.nextByte();
                System.out.println("The Module of two Numbers is : " + CheckNumberPositive.ModuleTwoNumber(a, b));

            }
        }
    }




//
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("-----------------------------------------");
//        System.out.println("------PLEASE ENTER POSITIVE NUMBER-------");
//        System.out.println("-----------------------------------------");
//        int PositieNumber = scanner.nextInt();
//        if (PositieNumber>=0) {
//            System.out.println("The Number is positive "+ PositieNumber);
//        }
//        else
//            System.out.println("The Number is Negative..");
//    }
}
