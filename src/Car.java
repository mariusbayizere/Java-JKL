public class Car {
    public  static String name;
    String model="Mercedence";
     String year="2025";
     String color="Blue";

    public  void accerated(){
        System.out.println("Car are accerated !!!!");
    }
    public  void brake(){
        System.out.println("The car was Braked ");
    }

    public void get_speed(){
        System.out.println("the car are getting the speed now!!!");
    }
    public  static void  getNUmber(){
        int a = (50+20) + (10*4) - 60;
        System.out.println("Value of a is " + a);
    }

}


class Test{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.name= "Marius Bayizere";
        obj.accerated();
        obj.brake();
        obj.get_speed();
        System.out.println("Car has  " + obj.model + "Your car is working fine!!!!!!");
        System.out.println("Car has  " + obj.year + "Your car is working fine!!!!!!");
        System.out.println("Car has  " + obj.color + "Your car is working fine!!!!!!");
        System.out.println("Hello  " + Car.name + "Your car is working fine!!!!!!");
        Car.getNUmber();
    }
}