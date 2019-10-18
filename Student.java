/**
 * Student
 */
public class Student {

    private String name, surname, teacher, interests;
    private int age;

    public Student (int age, String name,String surname,String teacher, String interests) {
        this.age = age;
        this.teacher = teacher;
        this.name = name;
        this.surname = surname;
        this.interests = interests;
    }

    @Override
    public String toString() {
        return age + " " + teacher + " " + name + " " + surname + "interests";
    }
}