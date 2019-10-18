/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        Lesson lesson = new Lesson(1, "Abc");
        Teacher teacher = new Teacher ("Jan ", "Kowalski ", "robotyka");
        System.out.println(lesson);
        System.out.println("Witaj");
        System.out.println(" Twój nauczyciel to: ");
        System.out.println(teacher);
    }
}
