/**
 * Room
 */
public class Room {

    private int roomNumber;
    /* numer sali */
    private String theme;
    // tematyka sali
    private int workstationNumbers;

    // liczba stanowisk w danej sali
    Room(int roomNumber, String theme, int workstationNumbers) {

        this.roomNumber = roomNumber;
        this.theme = theme;
        this.workstationNumbers = workstationNumbers;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}