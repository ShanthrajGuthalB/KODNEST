public class Cgpa {
    String name;
    double sem1;
    double sem2;
    double sem3;
    double sem4;
    double sem5;
    double sem6;
    double sem7;
    double sem8;
    int sem;
    double m;
    int t;

    public Cgpa(String name, double sem1, double sem2, double sem3, double sem4, double sem5, double sem6, double sem7,
                double sem8, int sem, double m, int t) {
        this.name = name;
        this.sem1 = sem1;
        this.sem2 = sem2;
        this.sem3 = sem3;
        this.sem4 = sem4;
        this.sem5 = sem5;
        this.sem6 = sem6;
        this.sem7 = sem7;
        this.sem8 = sem8;
        this.sem = sem;
        this.m = m;
        this.t = t;
    }

    public void marks() {
        System.out.println("Hello, " + name + "!");
    }

    public void result() {
        double totalCgpa = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / sem;
        System.out.println("Your CGPA is: " + totalCgpa);
    }
    
    public void percentage() {
        double totalCgpa = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / sem;
        double finalCgpa = (totalCgpa - m) * t;
        System.out.println("Your Percentage is: " + finalCgpa);
    }
}