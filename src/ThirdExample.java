import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-05.
 */
public class ThirdExample {

    public static void main(String[] args) {
        /*Uzduotis: Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        KMI = masė (kg) / (ūgis(m))^2*/

        Scanner sc = new Scanner(System.in); // system.in dudoa ivesti duomensi i programa

        System.out.println("Please insert your kg");
        double kg = sc.nextDouble();
        System.out.println("Please insert your height cm");
        double cm = sc.nextDouble();


        /*double kmi = kg / (cm*cm);
        System.out.println("KMI yra >> " + kmi);*/

        //double result = kmi(kg, cm);
        System.out.println("KMI 2 yra >>" + kmi( kg, cm));
    }


        public static double kmi(double kg, double cm){
        return kg/(cm*cm);



    }

//TODO 1 susikurti metoda
    // 2 grazintu double
    //3 per parametrus paimtu 2 double kintamuosius
    //4 apskaiciuoja KMI
}
