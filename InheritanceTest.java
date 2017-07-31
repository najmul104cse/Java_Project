package inheritance;

class Vehicle {

    String color;
    int speed;
    int size;

    void attributes(){

        System.out.println("color : "+color);
        System.out.println("Speed : "+speed);
        System.out.println("Size : "+size);


    }
  }

  class Car extends Vehicle{

        int cc;
        int gears;

        void attributescar(){

            System.out.println("Color of Car : "+color);
            System.out.println("Speed of Car : "+speed);
            System.out.println("Size of Car : "+size);
            System.out.println("CC of Car : "+CC);
            System.out.println("No of gears of Car : "+gears);
        }
  }

  public class Test{

     public static void main(String[] args){

         Car s = new Car();
         s.color = "Blue";
         s.speed = 180;
         s.size = 22;
         s.cc = 1000;
         s.gears = 5;
         s.attributescar();
     }
}






