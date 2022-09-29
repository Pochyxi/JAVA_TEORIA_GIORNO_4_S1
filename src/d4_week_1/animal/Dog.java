package d4_week_1.animal;

public class Dog extends Animal {

    public Dog(String n, int a){
        super(n, a);

    }

    public void hello() {
        System.out.println("sono hello");
        this.m1();
    }

//    public void m1() {
//        super.m1 ();
//        System.out.println ("wow anche io sono m1 ma di Dog");
//    }
}
