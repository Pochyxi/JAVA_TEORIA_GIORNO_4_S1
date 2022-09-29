package d4_week_1.animal;

public class Chiwawa extends Dog{
    String caratteristiche;

    public Chiwawa(String n, int a, String p) {
        super(n, a);
        this.caratteristiche = p;
    }

    public String getCaratteristiche() {
        return caratteristiche;
    }
}
