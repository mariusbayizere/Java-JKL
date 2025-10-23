import java.util.Scanner;

public class SwitchStatement {


    static  String DayOfWeek(short days){
       return switch (days){
            case 1-> { yield  "Monday"; }
            case 2-> { yield  "Tuesdays"; }
            case 3-> { yield  "Wenesdays"; }
            case 4-> { yield  "Thrisday"; }
            case 5 ->{ yield  "Friday";}
            case 6-> { yield  "sutardays"; }
            case 7-> { yield  "Sunday"; }
            default->{ yield  "Invalid Days"; }
        };
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Days of weeks");
        short days = scanner.nextShort();

        System.out.println("TO DAY IS "+ DayOfWeek(days));

    }

}
