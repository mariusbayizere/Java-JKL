//public class ForLoop {
//    public static void main(String[] args) {
//        short i = 2;
//        for (; i <= 20;){
//
//            if (i %2 ==0){
//                System.out.println("The even Number is "+ i);
//            }
//            i++;
//        }
//   }
//}
 class  TestLoop {

    static  int i = 1;


    public static void testloop(){

        for(;;System.out.println("code are tested " + i)){
            if (i <= 10){
                System.out.println(i);
                i++;
            }
            else {
                break;
            }
        }

    }

    public static void main(String[] test) {
        testloop();
    }

}