
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car newCar = new Car("",0);
            System.out.println("— Введите название машины №"+(i+1)+":");
            newCar.name = scanner.next();

            boolean isCorrectSpeed = false;
            while (!isCorrectSpeed) {
                System.out.println("— Введите скорость машины №"+(i+1)+":");
                while(!scanner.hasNextInt()) {
                    System.out.println("— Неправильная скорость");
                    scanner.next();
                }
                int speed = scanner.nextInt();
                if (speed > 250 || speed < 0) {
                    System.out.println("— Неправильная скорость");
                } else {
                    isCorrectSpeed = true;
                    newCar.speed = speed;
                }
            }

            Race.getLeader(newCar);
        }

        System.out.println("Самая быстрая машина: " + Race.leaderName);
    }
}