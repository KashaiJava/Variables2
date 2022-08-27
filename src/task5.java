public class task5 {
    public static void main(String[] args) {
int kraskaAll = 120;
int whiteKraska1Klass = 2;
int brownKraska1Klass = 4;
int class1 = kraskaAll / (whiteKraska1Klass + brownKraska1Klass);
int whiteKrasskaAll = whiteKraska1Klass * class1;
int brownKraskaAll = brownKraska1Klass * class1;
System.out.println("В школе, где " + class1 + " классов, нужно " + whiteKrasskaAll + " банок белой краски и " + brownKraskaAll + " банок коричневой краски");



    }
}
