public class Car {
    public  static String name;
    static String model;
    static String year;
    static String color;

    public  void accerated(){
        System.out.println("Car are accerated !!!!");
    }
    public  void brake(){
        System.out.println("The car was Braked ");
    }

    public void get_speed(){
        System.out.println("the car are getting the speed now!!!");
    }
}


class Test{
    public static void main(String[] args) {
        Car.model = "test 1";
        Car.color = "red";
        Car.year= "2023";
        Car obj = new Car();
        Car.name= "Marius Bayizere";
        obj.accerated();
        obj.brake();
        obj.get_speed();
        System.out.println("Hello  " + Car.name + "Your car is working fine!!!!!!");
    }
}