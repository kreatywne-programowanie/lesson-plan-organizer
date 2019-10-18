/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        Lesson lesson = new Lesson(1, "Abc");
        System.out.println(lesson);
        System.out.println("Witaj");
        Group group = new Group("robotyka", "3", "Tomek","sala 3");
        System.out.println(group);
    }
}