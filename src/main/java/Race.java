public class Race {
    //Название лидера
    String leaderName = "";
    //Пройденная лидером дистанция за 24 часа
    int leaderDistance = 0;

    //Метод, в котором определяем,
    // является ли текущий автомобиль лидером
    public void evaluateLeader(Car car) {
        int distance = 24 * car.speed;

        if (distance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = distance;
        }
    }

    //Метод, который возвращает имя лидера
    public String getLeader() {
        return leaderName;
    }
}
