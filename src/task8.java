public class task8 {
    public static void main(String[] args) {
        float tenPercent = 0.1f;
        int mashaOld = 67_760;
        int denisOld = 83_690;
        int kristinaOld = 76_230;
        int mashaNew = (int) (mashaOld + mashaOld * tenPercent);
        int denisNew = (int) (denisOld + denisOld * tenPercent);
        int kristinaNew = (int) ( kristinaOld + kristinaOld * tenPercent);
        int mashaDiff = (mashaNew - mashaOld) * 12;
        int denisDiff = (denisNew - denisOld) * 12;
        int kristinaDiff = (kristinaNew - kristinaOld) * 12;
        System.out.println("Маша теперь получает " + mashaNew +  " рублей. Годовой доход вырос на " + mashaDiff + " рублей" );
        System.out.println("Маша теперь получает " + denisNew +  " рублей. Годовой доход вырос на " + denisDiff + " рублей" );
        System.out.println("Маша теперь получает " + kristinaNew +  " рублей. Годовой доход вырос на " + kristinaDiff + " рублей" );









    }


}
