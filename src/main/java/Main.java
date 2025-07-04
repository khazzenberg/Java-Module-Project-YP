
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        for (int i = 0; i < 3; i++) {
            String carName = "";
            int carSpeed = 0;

            System.out.println("— Введите название машины №"+(i+1)+":");
            carName = scanner.next();

            int minSpeed = 0;
            int maxSpeed = 250;
            boolean isCorrectSpeed = false;

            while (!isCorrectSpeed) {
                System.out.println("— Введите скорость машины №"+(i+1)+":");
                while(!scanner.hasNextInt()) {
                    System.out.println("— Неправильная скорость");
                    scanner.next();
                }
                int speed = scanner.nextInt();
                if (speed > maxSpeed || speed < minSpeed) {
                    System.out.println("— Неправильная скорость");
                } else {
                    isCorrectSpeed = true;
                    carSpeed = speed;
                }
            }

            Car newCar = new Car(carName, carSpeed);
            race.evaluateLeader(newCar);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader());
    }
}