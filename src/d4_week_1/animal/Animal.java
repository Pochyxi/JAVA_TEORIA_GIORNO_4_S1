package d4_week_1.animal;

abstract public class Animal { // se inserisco final davanti ad Animal // abstract significa che non può essere fatto new Animal
    protected String nome;
    protected int eta;

    public Animal ( String _name, int _eta ) {
        this.nome = _name;
        this.eta = _eta;
    }

    final protected void m1 () {
        System.out.println ( "ciao sono m1 di animal" );
    }

    public String toString () {
        return "Ciao, sono un Animal e mi chiamo " + nome;
    }
}
