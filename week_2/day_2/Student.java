public class Student implements Comparable<Student> {

    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return this.grade - other.grade; // sort by grade
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }
}