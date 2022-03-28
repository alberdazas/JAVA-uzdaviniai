package Topic_2;

import java.util.Scanner;

public class Plotas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite kambario ilgį: ");
        int ilgis = reader.nextInt();
        System.out.println("Įveskite kambario ploti: ");
        int plotis = reader.nextInt();
        System.out.println("Plyteliu vieno kvadratinio metro kaina");
        double m2Kaina = reader.nextDouble();
        int kamPlotas = ilgis * plotis;
        System.out.println("Kambario plotas yra: " +kamPlotas);
        double suma = kamPlotas * 1.05 * m2Kaina;
        System.out.println("Kpinigų suma kurią reikia mokėti yra: " +suma);

    }
}
