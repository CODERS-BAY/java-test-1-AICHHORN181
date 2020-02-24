import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int iInt = 0;
        boolean bisPrimzahl = true;
        Scanner input = new Scanner(System.in);

        System.out.print(("Bitte zu prüfende Zahl eingeben: "));
        iInt = input.nextInt();

        for (int i = 2; i < (iInt/2) && bisPrimzahl; i++)
            if ((iInt % i) == 0)
                bisPrimzahl = false;

        if (bisPrimzahl)
            System.out.println(iInt + " ist eine Primzahl!");
         else
            System.out.println(iInt + " ist keine Primzahl;");
    }
}

