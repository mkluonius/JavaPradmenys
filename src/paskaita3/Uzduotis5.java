package paskaita3;

import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-07.
 */
public class Uzduotis5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prasau iveskite 5 skaicius ir paspauskite Enter");
        int i = 0;
        int sum = 0;
        int[] masyvas = new int[5];
        while (i<5) {
            int skaicius = scanner.nextInt();
            masyvas [i] = skaicius;
            sum+=skaicius;
            i++;

        }
        for (i=0; i<masyvas.length; i++)    {

            System.out.println("Masyvo skaicius " + i + " yra " + masyvas[i]);

        }
        System.out.println("Masyvo skaiciu suma lygi: " + sum);



    }

    }



