package d4_week_1;

import d4_week_1.animal.Animal;
import d4_week_1.animal.Chiwawa;
import d4_week_1.animal.Dog;

public class Main {

    public static void main ( String[] args ) {
        Student s4 = new Student ( "Cristoforo Colombo" , 450 , StudentGender.M );
        s4.m1 ( );
        s4.m1 ( ( byte ) 8 );
        s4.m1 ( s4 );
        System.out.println ( s4.getGender ( ) );
        Dog fuffy = new Dog ( "fuffy" , 4 );
        fuffy.hello ( );
        Chiwawa aggre = new Chiwawa ( "aggre", 5, "Sono bello" );

        Animal[] animals = { fuffy, aggre };

        System.out.println (fuffy instanceof Animal );

        System.out.println ("ciao" + fuffy + " qualcosa" );

    }
}
