package src.Java_Project;

public class Personel {

    public String emer;
    public int id;
    public String departamenti;
    public float rroga;

    public Personel(){

    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String departamenti) {
        this.departamenti = departamenti;
    }

    public float getRroga() {
        return rroga;
    }

    public void setRroga(float rroga) {
        this.rroga = rroga;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "emer='" + emer + '\'' +
                ", id=" + id +
                ", departamenti='" + departamenti + '\'' +
                ", rroga=" + rroga +
                '}';
    }
}
