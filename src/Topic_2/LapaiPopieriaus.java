package Topic_2;

import java.util.Scanner;

public class LapaiPopieriaus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Klasėje visko mokinių?");
        int n = reader.nextInt();
        System.out.println("Kiek lapų sudaro konspektą?");
        int m = reader.nextInt();
        int k = n * m;
        System.out.println("Viso reikės " + k + " lapų popieriaus");
    }
}
