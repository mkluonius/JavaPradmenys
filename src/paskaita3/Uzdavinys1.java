package paskaita3;

import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-06.
 */
public class Uzdavinys1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("irasykite skaiciu");
        int numb = sc.nextInt();

        if (numb%2==0){
            System.out.println("Skaicius yra lyginis");
        } else{
            System.out.println("Skaicius yra nelyginis");
        }

    }
}
