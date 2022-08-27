public class task7 {
    public static void main(String[] args) {
        byte weightLoseKg = 7;
        int gramsPerKg = 1000;
        int weightLoseG = weightLoseKg * gramsPerKg;
        System.out.println("Потеря ВЕСа в граммах " + weightLoseG );
        short lose250 = 250;
        short lose500 = 500;
        int daysA = weightLoseG / lose250;
        int daysB = weightLoseG / lose500;
        double avgDays = (daysA + daysB) / (2 * 1.0);
        System.out.println("Мин дней похудания " + daysA);
        System.out.println("Макс дней похудания " + daysB);
        System.out.println("Срд дней похудания " + avgDays);










    }
}
