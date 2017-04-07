import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-05.
 */
public class FourthClass {

    public static void main(String[] args) {

        System.out.println ("Average fuel consumption is" + avg());
        //pradeda spausdinti nuo cia, bet pamato kad turim metoda parametruose,
        // automatiskai iskviecia metoda avg, skaiciuoja duomenis, kol pamato "return avg" supranta kad reikia eit i kita metoda "avg"
        // tada eina i sekanti metoda avg ir ten reikia skaiciuoti vidutines sanaudas, suskaiciuoja ir main metode meta

    }

    public static double avg() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of kilometers you have driven");
        double km = sc.nextDouble();
        System.out.println("Please insert number of liters consumed");
        double l = sc.nextDouble();
        return avg(km, l);
    }


    public static double avg(double km, double l) { //prie parametru reikia nurodyti tipa ir lokalu varda

        return l * 100 / km;
    }

}
