package d4_week_1;

import d4_week_1.animal.Jumpable;

abstract public class Person implements Jumpable, Runnable {

    String name;
    int age;

    public Person ( String s, int i ) {
        this.age = i;
        this.name = s;
    }

    public static void main ( String[] args ) {

    }

    @Override
    public void jump () {
        System.out.println ( "salto" );
    }

    @Override
    public void jump ( int cm ) {
        System.out.println ( "salto in cm" );
    }

    @Override
    public void jump ( double mm ) {
        System.out.println ( "salto in mm" );
    }
}

class Programmatore extends Person {


    public Programmatore ( String s, int i ) {
        super ( s, i );
    }

    @Override
    public void jump () {
        System.out.println ( "salto" );
    }

    @Override
    public void jump ( int cm ) {
        System.out.println ( "salto in cm" );
    }

    @Override
    public void jump ( double mm ) {
        System.out.println ( "salto in mm" );
    }

    @Override
    public void run () {
        System.out.println ( "corro come un drago" );
    }
}