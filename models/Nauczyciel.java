/**
 * Nauczyciel
 */
public class Nauczyciel {

    private String imie;
    private String nazwisko;
    private String adres;

    /**
     * @return the adres
     */
    public String getAdres() {
        return adres;
    }

    public Nauczyciel(String i, String n, String a) {
        this.imie = i;
        this.nazwisko = n;
        this.adres = a;
    }

    public String przedstawSie() {
        return this.imie + " " + this.nazwisko;
    }

    public String podajAdres() {
        return this.adres;
    }
}
