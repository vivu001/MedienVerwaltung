package DC_A20;

public class Knoten {
    private Student student;
    private Knoten knotenLinks;
    private Knoten knotenRechts;

    public Knoten(Student student) {
        this.student = student;
    }

    public Knoten getKnotenLinks() {
        return knotenLinks;
    }

    public Knoten getKnotenRechts() {
        return knotenRechts;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setKnotenLinks(Knoten knotenLinks) {
        this.knotenLinks = knotenLinks;
    }

    public void setKnotenRechts(Knoten knotenRechts) {
        this.knotenRechts = knotenRechts;
    }
}
