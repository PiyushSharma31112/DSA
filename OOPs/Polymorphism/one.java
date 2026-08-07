import java.util.*;

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;

    Car(String color, int maxSpeed , int acceleration, int tyreFriction) {
        this.color = color;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.tyreFriction = tyreFriction;
    }    
}


class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.acceleration);
        System.out.println(car.tyreFriction);
        input.close();
    }
}