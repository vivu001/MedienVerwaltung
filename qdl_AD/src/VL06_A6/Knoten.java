package VL06_A6;

public class Knoten {
    private int schluessel;
    private Knoten links;
    private Knoten rechts;

    public Knoten(int schluessel) { this.schluessel = schluessel; }
    public int getSchluessel() { return this.schluessel; }
    public Knoten getLinks() { return this.links; }
    public Knoten getRechts() { return this.rechts; }
    public void setLinks(Knoten teilbaumLinks) { this.links = teilbaumLinks; }
    public void setRechts(Knoten teilbaumRechts) { this.rechts = teilbaumRechts; }

}
