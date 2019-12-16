package ЛР5;

public class StudentS {
    public static void main (String [] args) {
        Student std [] = new Student[3];
        Student p1 = new Student("Sergei", 20, 4);
        Student p2 = new Student("Eldar", 20,4);
        Student p3 = new Student("Maria", 20, 4);

        std[0] = p1;
        std[1] = p2;
        std[2] = p3;
    }

    public static class Student {
        private String name;
        private int age;
        private int course;
        public Student (String _name, int _age, int _course){
            name = _name;
            age = _age;
            course = _course;
        }
    }
}
