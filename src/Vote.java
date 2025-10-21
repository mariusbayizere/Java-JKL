import java.util.Scanner;

public class Vote {

//    boolean isCitizen = true;



    public  void iSeligibleVote(byte age, String isCitizen){

                if (age >= 18){
                    if(isCitizen.equals("Rwanda") || isCitizen.equals("rwanda") || isCitizen.equals("rwandan")){
                        System.out.println("Your citizen is allow you to Vote Because you are Rwandan");
                    }
                    else {
                        System.out.println("you citizen is not allow you to Vote your are not Rwandan");
                        return;
                    }
                    System.out.println("You are eligible to vote !!!");
                }
                else {
                    System.out.println("You are age is still under age you are not elgible to vote");
                }

    }

    public static void main(String[] args) {
            while (true){
                Vote obj = new Vote();
                System.out.println("please Enter your age.");
                Scanner scanner = new Scanner(System.in);
                byte ageTovote = scanner.nextByte();
                System.out.println("please Enter  your citizen");
                String citizen = scanner.next();

                obj.iSeligibleVote(ageTovote, citizen);
            }
    }


}
