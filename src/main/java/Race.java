public class Race {
    //Название лидера
    static String leaderName = "";
    //Пройденная лидером дистанция за 24 часа
    static int leaderDistance = 0;

    //Метод, в котором определяем,
    // является ли текущий автомобиль лидером
    public static void getLeader(Car car) {
        int distance = 24 * car.speed;

        if (distance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = distance;
        }
    }
}
