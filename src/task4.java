public class task4 {
    public static void main(String[] args) {
     int butilka2Min = 16;
     int butilka1Min =  butilka2Min / 2;
     int butilka20Min = butilka1Min * 20;
     System.out.println("За 20 минут машина произвела " + butilka20Min + " бутылок" );
     int sutki = 24 * 60;
     int butilkaSutki = butilka1Min * sutki;
     System.out.println("За сутки машина произвела " + butilkaSutki + " бутылок" );
     int days3 = sutki * 3;
     int butilka3Days = days3 * butilka1Min;
     System.out.println("За три дня машина произвела " + butilka3Days + " бутылок" );
     int month = sutki * 30;
     int butilkaMonth = month * butilka1Min;
     System.out.println("За месяц машина произвела " + butilkaMonth + " бутылок" );












    }
}
