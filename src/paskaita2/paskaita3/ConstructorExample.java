package paskaita2.paskaita3;

/**
 * Created by BT-16-00012 on 2017-04-06.
 */
public class ConstructorExample {
    //tuscias konstruktorius, visos klases turi pagal nutylejima tuscia konstruktoriu
    public ConstructorExample (){
        System.out.println("Tuscias konstruktorius");
    }
    //konstruktoriui perduiodama reiksme vienas skaicius
    public ConstructorExample (int id){
        System.out.println("2 konstruktorius su reiksme >> " + id);
    }

}
class MyMainApp{
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);

    }
}
