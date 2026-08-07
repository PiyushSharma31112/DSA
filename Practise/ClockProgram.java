package Practise;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class ClockProgram {
    static int alarmHour = -1;
    static int alarmMin = -1;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
            System.out.println("1. clock");
            System.out.println("2. Set Alarm");
            System.out.println("3. Stopwatch");
            System.out.println("4. Date of Birth");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");

            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    LocalTime time = LocalTime.now();
                    System.out.printf("%02d:%02d:%02d\n", time.getHour(), time.getMinute(), time.getSecond());

                    if (time.getHour() == alarmHour && time.getMinute() == alarmMin) {
                        System.out.println("ALARM...");
                    }
                    break;
                case 2:
                    System.out.println("Enter Hour: ");
                    alarmHour = sc.nextInt();
                    System.out.println("Enter minute: ");
                    alarmMin = sc.nextInt();
                    System.out.println("Alarm set");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Press ENTER to start");
                    sc.nextLine();
                    long start = System.currentTimeMillis();
                    System.out.println("Press ENTER to stop");
                    sc.nextLine();
                    long end = System.currentTimeMillis();
                    System.out.println("Elapsed time: " + (end - start) / 1000.0 + " seconds");
                    break;
                
                case 4:
                    System.out.println("Enter Year: "); 
                    int y = sc.nextInt();
                    System.out.println("Enter Month: ");
                    int m = sc.nextInt();
                    System.out.println("Enter day: ");
                    int d = sc.nextInt();
                    
                    LocalDate dob = LocalDate.of(y, m, d);
                    LocalDate today = LocalDate.now();

                    long days = ChronoUnit.DAYS.between(dob, today);
                    long hour = days * 24;

                    System.out.println("Days: " + days);
                    System.out.println("Hours: " + hour);
                    break;
            
                case 5:
                    System.out.println("Gooooodddd byeeeeeeee !");
                    return;
            }
        }
        }
    }
}
