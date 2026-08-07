import java.util.Scanner;

public class Three {

    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    boolean isEngineStarted;
    int currentSpeed;

    Three(String color, int maxSpeed, int acceleration, int tyreFriction) {
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
        if (!isEngineStarted) {
            System.out.println("Car has not started yet");
        } else {
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

    void soundHorn() {
        if (!isEngineStarted) {
            System.out.println("Car has not started yet");
        } else {
            System.out.println("Beep Beep");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String color = sc.next();
        int maxSpeed = sc.nextInt();
        int acceleration = sc.nextInt();
        int tyreFriction = sc.nextInt();

        Three car = new Three(color, maxSpeed, acceleration, tyreFriction);

        car.soundHorn();   // Car has not started yet
        car.startEngine();
        car.soundHorn();   // Beep Beep

        sc.close();
    }
}
