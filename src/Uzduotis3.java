import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-06.
 */
public class Uzduotis3 {

    //1.3.  Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje turi būti atvaizduojama įvestų skaičių suma.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
int sum = 0;
        while (true) {

            System.out.println("irasykite skaiciu");
            int sk = sc.nextInt();
            sum = sum + sk;  //sita eilute reiskia kad prie sumos reikai prideti skaiciu esanti desineje, gali buti isreiksta sitaip: sum += sk;
            if (sk == 0) {

                break;
            }

        }
        System.out.println("Ivestu skaiciu suma lygi " + sum);
    }

}
