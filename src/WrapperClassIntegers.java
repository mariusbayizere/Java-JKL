import java.util.Scanner;

public class WrapperClassIntegers {


    static short a =  160;
    static  long telephone = 250_787_667_700L;
    static long IdNumber = 119_987_015_855_0960L;


    public static long GetIDcardNumber(long  Idnumber){
        return  Idnumber;
    }

    /**
     *
     * @param number1
     * @param number2
     * @return: return the sum of two numbers
     */
    public static  byte sumofnumber(byte number1, byte number2){
        return (byte) (number1 + number2);
    }


    //wrapper class
    /**
     * this is method is showing the wrapper class of the Byte datatype
     * return: void
     */
    public static void wrapperClassByte(){
        byte intialnumbeer = Byte.MIN_VALUE;
        byte lastnumber = Byte.MAX_VALUE;

        System.out.println("The Range the Short datatye must be storing use it may start from :"+  intialnumbeer);
        System.out.println("The Last number this Byte datatype must be storing is it will stop here :" + lastnumber);
    }


    /**
     * this method is showing the wrapper class of short datatype
     * return: void
     */
    public static void wrapperClassShort(){
        short intialnumbeer = Short.MIN_VALUE;
        short lastnumber = Short.MAX_VALUE;
        System.out.println("The Range the Short datatye must be storing use it may start from  :"+  intialnumbeer);
        System.out.println("The Last number this Short datatype must be storing is it will stop here :" + lastnumber);
    }

    /**
     * this method is showing the wrapper class of the Integer datatype
     * return: void
     */
    public static void wrapperClassInteger(){
        int intialnumbeer = Integer.MIN_VALUE;
        int lastnumber = Integer.MAX_VALUE;
        System.out.println("The Range the Integer datatye must be storing use it may start from :"+  intialnumbeer);
        System.out.println("The Last number this Integer datatype must be storing is it will stop here :" + lastnumber);
    }

    /**
     * this method is showing the wrapper class of the long datatype
     * return: void
     */
    public static void wrapperClassLong(){
        long intialnumbeer = Long.MIN_VALUE;
        long lastnumber = Long.MAX_VALUE;
        System.out.println("The Range the Long datatye must be storing use it may start from :"+  intialnumbeer);
        System.out.println("The Last number this Long datatype must be storing is it will stop here :" + lastnumber);
    }

    public static void main(String[] args) {
        wrapperClassByte();
        wrapperClassShort();
        wrapperClassShort();
        wrapperClassLong();
        System.out.println("the Value of a :" + a);
        System.out.println("My phone number is  : "+ telephone);
        System.out.println("My ID number is  : "+  IdNumber);
        System.out.println("The ID numnber of this people is this : " + GetIDcardNumber(IdNumber));
        Scanner scanner = new Scanner(System.in);
        byte a, b;
        System.out.print("please Enter the first Number :");
        a= scanner.nextByte();
        System.out.print("please Enter the second Number :");
        b= scanner.nextByte();
        System.out.println("The sum of "+ a +"+" +b +"=" +sumofnumber(a, b));

    }
}
