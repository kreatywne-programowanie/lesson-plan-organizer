/**
 * Lesson
 */
public class Lesson {

    private int number;
    private String teacher;

    public Lesson (int number, String teacherName) {
        this.number = number;
        this.teacher = teacherName;
    }

    @Override
    public String toString() {
        return number + " " + teacher;
    }
}