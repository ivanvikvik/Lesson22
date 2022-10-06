package by.itstep.vikvik.model.data;

// entity-class
public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    // default constructor
    public Student() {
        name = "no name";
        mark = 4;
        age = 16;
        alive = true;
    }

    // constructor with params
    public Student(String n, int a, double m, boolean al) {
        name = n;
        age = a;
        mark = m;
        alive = al;
    }

    public Student(String n) {
        name = n;
    }

    public Student(boolean al) {
        alive = al;
    }

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public Student(int a, String n) {
        name = n;
        age = a;
    }

    // copy-constructor
//    public Student(Student student) {
//        name = student.name;
//        age = student.age;
//        mark = student.mark;
//        alive = student.alive;
//    }


    public String getInfo() {
        return name
                + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
