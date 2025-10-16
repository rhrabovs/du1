import java.time.LocalDate;

public class Prodejce {
    String jmeno;
    LocalDate datumNarozeni;
    Integer sjednaneSmlouvy;
    double prodaneMnozstvi;
    Boolean senior;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public Integer getSjednaneSmlouvy() {
        return sjednaneSmlouvy;
    }

    public void setSjednaneSmlouvy(Integer sjednaneSmlouvy) {
        this.sjednaneSmlouvy = sjednaneSmlouvy;
    }

    public double getProdaneMnozstvi() {
        return prodaneMnozstvi;
    }

    public void setProdaneMnozstvi(double prodaneMnozstvi) {
        this.prodaneMnozstvi = prodaneMnozstvi;
    }

    public Boolean getSenior() {
        return senior;
    }

    public void setSenior(Boolean senior) {
        this.senior = senior;
    }
}
