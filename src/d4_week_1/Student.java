package d4_week_1;

public class Student {
    private String nome;
    private int eta;
    private StudentGender gender;

    // costruttore

    public Student() {
        this("uknown", 0, StudentGender.M);
    }
    public Student(String n, int a, StudentGender g) {
        this.setNome( n );
        this.setEta( a );
        this.setGender( g );
    }

    public String getNome() {
        return nome;
    }
    public int getAge() {
        return eta;
    }
    public StudentGender getGender() {
        return gender;
    }
    public void setNome(String n) {
        nome = n;
    }

    public void setEta(int n) {
        eta = n;
    }

    public void setGender(StudentGender n) {
        gender = n;
    }

    public void m1() {
        System.out.println("hai chiamato m1 senza parametri");
    }

    public void m1(byte x) {
        System.out.println("hai chiamato m1 con i parametri byte");
    }

    public void m1 (Object o) {
        System.out.println("hai chiamato m1 con i parametri Object");
    }


}
