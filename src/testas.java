import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by BT-16-00012 on 2017-04-04.
 */
public class testas {
    public static void main(String[] args) {
        System.out.println("Hi Mindaugas");
       FirstExampleSupportClass example = new FirstExampleSupportClass();
       example.sayHi();
       int sum = example.sum(10, 20);
       // System.out.println(;example.sum(10, 20));
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.println("Inserted number >>" + insertedNumb);*/

        example.userName(scanner);
        example.symbolNumber(scanner);
        example.skaiciuSuma (scanner);
        example.skaiciuSkirtumas(scanner);
    }


}


class FirstExampleSupportClass{

    public void userName(Scanner sc) {
        System.out.println("Please insert your name");
        String name = sc.nextLine();   //next line consolej nuskaito eilute kur irasai varda
        System.out.println("Hi " + name);
    }

        public void symbolNumber (Scanner sc) {
            System.out.println("Please insert a word");
            String name = sc.nextLine();
            System.out.println("The length of the name is " + name.length());


    }

    public void skaiciuSuma (Scanner sc){
        System.out.println("Please insert first number");
        int pirmasSkaicius = sc.nextInt();
        System.out.println("Please insert second number");
        int antrasSkaicius = sc.nextInt();
        System.out.println("Skaiciu suma = " + sum(pirmasSkaicius, antrasSkaicius));

    }
    public void skaiciuSkirtumas (Scanner sc) {
        System.out.println("please insert the first number");
        int pirmasSkaicius = sc.nextInt();
        System.out.println("Please insert the second number");
        int antrasSkaicius = sc.nextInt();
        System.out.println("Skaiciu skirtumas = " + minus(pirmasSkaicius, antrasSkaicius));

    }




  public void sayHi() {
System.out.println("Labas");
  }

  public int sum(int firstNumb, int secondNumb){
      return firstNumb + secondNumb;

  }
    public int minus(int pirmasSkaicius, int antrasSkaicius) {
        return pirmasSkaicius - antrasSkaicius;
    }

}