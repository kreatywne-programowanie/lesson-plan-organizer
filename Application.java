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
        Room newRoom = new Room (1,"SuperSalka",10);
    }
}
