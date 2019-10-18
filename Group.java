/**
 * Group
 */
public class Group {

    private String name;
    private String level;
    private String teacher;
    private String room;

    public Group( String name, String level, String teacher, String room){
        this.name =name;
        this.level = level;
        this.techer = techer;
        this.room = room;  
    }
    @Override
    public String toString() {
        return (name + " " + level + " " + teacher + " " + room);
 }
}
