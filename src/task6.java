public class task6 {
    public static void main(String[] args) {
        int bananasShtuk = 5;
        int bananasWeight = 80;
        int milkML = 200;
        int milkMlPerG= 100;
        int milkG = 105;
        int plombirShtuki = 2;
        int plombirWeight = 100;
        int eggsShtuki= 4;
        int eggsWeight = 70;
        double kgPerG = 1000;
        int weightAll = (bananasShtuk * bananasWeight) + (milkML / milkMlPerG * milkG) + (plombirWeight * plombirShtuki) + (eggsShtuki * eggsWeight);
        System.out.println("Общий вес в граммах " + weightAll + " гр");
        double weightAllKg = weightAll / kgPerG;
        System.out.println("Общий вес в киллограммах " + weightAllKg + " кг");
















    }





}
