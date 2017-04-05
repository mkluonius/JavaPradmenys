package paskaita2;

/**
 * Created by BT-16-00012 on 2017-04-05.
 */
public class SecondClassExample {
    public static void main(String[] args) {

        //kaip priskirti reiksme
        //int - tipas (pvz: int double string booelan ir t.t.)
        //x jusu lokalaus (nu tipo ka sugalvoji) kintamojo vardas, kintamasis, visada prasideda mazaja raide
        int x = 20;
        boolean isYouCanDrink = false;
        String name = "petras or Sigis"; //reiksme visada kabutese
        char a = 'a';

        //system.out.println naudojamas tik tada kai norime atspausdinti reiksme i console. LN nukelia i nauja eilute
        System.out.println("Petras");

        example2();
        SecondClassExample className = new SecondClassExample();
        className.example2();
        SecondClassExample.example2();

    }
//metodas nieko negrazina
    public static void example2(){

        //cia metodo turinys kuris atliekamas kai yra iskvieciamas metodas

    }

    public void example3(){
        example2();
    }
}
