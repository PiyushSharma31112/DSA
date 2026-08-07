import java.util.Scanner;

public class Two {

    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    boolean isEngineStarted;
    int currentSpeed;

    Two(String color, int maxSpeed, int acceleration, int tyreFriction) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.tyreFriction = tyreFriction;
        this.isEngineStarted = false;
        this.currentSpeed = 0;
    }

    void startEngine() {
        isEngineStarted = true;
    }

    void stopEngine() {
        isEngineStarted = false;
    }

    void accelerate() {
        if (isEngineStarted) {
            currentSpeed += acceleration;

            if (currentSpeed > maxSpeed) {
                currentSpeed = maxSpeed;
            }
        }
    }

    void applyBrakes() {
        currentSpeed -= tyreFriction;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String color = sc.next();
        int maxSpeed = sc.nextInt();
        int acceleration = sc.nextInt();
        int tyreFriction = sc.nextInt();

        Two car = new Two(color, maxSpeed, acceleration, tyreFriction);

        car.startEngine();

        car.accelerate();
        System.out.println(car.currentSpeed);

        car.applyBrakes();
        System.out.println(car.currentSpeed);

        car.applyBrakes();
        System.out.println(car.currentSpeed);

        car.applyBrakes();
        System.out.println(car.currentSpeed);
    }
}