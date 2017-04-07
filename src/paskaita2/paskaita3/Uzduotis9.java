package paskaita2.paskaita3;

import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-07.
 */
public class Uzduotis9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double firstNumber = getCorrectNumber(sc);
       double secondNumber = getCorrectNumber(sc);

        System.out.println("Iveskite komanda pvz (+; -; /; *):");

        String action = sc.next();
        calculator(firstNumber, secondNumber, action);


    }

    private static double getCorrectNumber (Scanner scanner, String title){

        while (true){
            System.out.println(title);
            try {
                double numb = scanner.nextDouble();
                return numb;
            }
            catch (Exception e){
                System.out.println("KA TU DARAI AKIVAIZDZIAI NEMASTAI!");
                scanner.nextLine();

            }

        }
    }

    private static void calculator(double firstNumb, double secondNumb, String action){

        switch (action){
            case "+":
                sum(firstNumb, secondNumb);
                break;

            case "-":
                minus(firstNumb, secondNumb);
                break;

            case "*":
                multiply(firstNumb, secondNumb);
                break;

            case "/":
                division(firstNumb, secondNumb);
                break;

                default:
                    System.out.println("KOMANDA NERASTA, pabandykite is naujo");
                    break;

    }
    }

    private static void sum(double firstNumb, double secondNumb) {
        System.out.println("suma yra >> " + (firstNumb + secondNumb));
    }

    private static void minus(double firstNumb, double secondNumb) {
        System.out.println("skirtumas yra >> " + (firstNumb - secondNumb));
    }

    private static void multiply(double firstNumb, double secondNumb) {
        System.out.println("sandauga yra >> " + (firstNumb * secondNumb));
    }

    private static void division(double firstNumb, double secondNumb) {
        if (secondNumb != 0) {
            System.out.println("dalyba yra >> " + (firstNumb / secondNumb));
        } else {
            System.out.println("Dalyba is nulio negalima!");
        }
    }
}