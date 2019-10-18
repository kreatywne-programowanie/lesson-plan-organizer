public class Teacher {
    private String name;
    private String surname;
    private String lesson;

    public Teacher(String name, String surname, String lesson){
        this.name = name;
        this.surname = surname;
        this.lesson = lesson;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + surname + lesson;
    }
}
