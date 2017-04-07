package paskaita3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-06.
 */
public class Uzduotis4 {

    //. Papildykite 1.3. programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių programa prašo pakartoti tol kol bus įvestas skaičius.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;




        while (true) {
            try {

            System.out.println("irasykite skaiciu");
            int sk = sc.nextInt();
            sum = sum + sk;  //sita eilute reiskia kad prie sumos reikai prideti skaiciu esanti desineje, gali buti isreiksta sitaip: sum += sk;
            if (sk == 0) {

                break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Irasyk skaiciu sakiau BL");

            sc.nextLine();
        }

        }
        System.out.println("Ivestu skaiciu suma lygi " + sum);

    }


}
