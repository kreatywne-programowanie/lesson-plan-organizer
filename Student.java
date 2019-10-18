/**
 * Student
 */
public class Student {

    private int age;
    private String name;
    private String surname;
    private String teacher;
    private String interests;

    public Student(int age, String name, String surname, String teacher, String interests) {
        this.age = age;
        this.teacher = name;
        this.name = surname;
        this.surname = teacher;
        this.interests = interests;
    }

    @Override
    public String toString() {
        return (age + " " + name + " " + surname + " " + teacher + " " + interests);
    }
}