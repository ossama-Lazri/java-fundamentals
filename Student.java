public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // use setter
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 20) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Ossama", 15);
        System.out.println(s.getName() + " - " + s.getGrade());

        s.setGrade(18);
        System.out.println("Updated: " + s.getGrade());
    }
}