/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        Lesson lesson = new Lesson(1, "Abc");
        Teacher teacher = new Teacher ("Jan ", "Kowalski ", "robotyka");
        System.out.println(lesson);
        System.out.println("Witaj");
        Group group = new Group("robotyka", "3", "Tomek","sala 3");
        System.out.println(group);
        System.out.println(" Twój nauczyciel to: ");
        System.out.println(teacher);
        Student student = new Student(1, "tomasz", "Jan", "Kowalski","programowanie");
        System.out.println(student);

    }
}
