import java.util.ArrayList;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManager {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ossama", 15));
        students.add(new Student("Ali", 12));
        students.add(new Student("Sara", 18));

        // display
        for (Student s : students) {
            System.out.println(s.name + " - " + s.grade);
        }

        // average
        int sum = 0;
        for (Student s : students) {
            sum += s.grade;
        }

        System.out.println("Average: " + (sum / students.size()));
    }
}