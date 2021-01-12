package Model;

public class Country {
    private String Name;
    private String Kontinent;
    private Long  Flache;
    private Long  Bevolkerung;
    private String Haupstadt;

    public Country(String Name,String Kontinent,Long Flache,Long Bevolkerung,String Haupstadt) {
        this.Name=Name;
        this.Kontinent=Kontinent;
        this.Flache=Flache;
        this.Bevolkerung=Bevolkerung;
        this.Haupstadt=Haupstadt;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getKontinent() {
        return Kontinent;
    }

    public void setKontinent(String kontinent) {
        Kontinent = kontinent;
    }

    public Long getFlache() {
        return Flache;
    }

    public void setFlache(Long flache) {
        Flache = flache;
    }

    public Long getBevolkerung() {
        return Bevolkerung;
    }

    public void setBevolkerung(Long bevolkerung) {
        Bevolkerung = bevolkerung;
    }

    public String getHaupstadt() {
        return Haupstadt;
    }

    public void setHaupstadt(String haupstadt) {
        Haupstadt = haupstadt;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + Name + '\'' +
                ", Kontinent='" + Kontinent + '\'' +
                ", Flache=" + Flache +
                ", Bevolkerung=" + Bevolkerung +
                ", Haupstadt='" + Haupstadt + '\'' +
                '}';
    }
}
