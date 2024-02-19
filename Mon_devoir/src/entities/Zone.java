package entities;

import java.util.List;

public class Zone {
    private int id;
    private String nomZone;
    private List<Bien> biens;


    public List<Bien> getBiens() {
        return biens;
    }
    public void setBiens(List<Bien> biens) {
        this.biens = biens;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomZone() {
        return nomZone;
    }
    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }
}
