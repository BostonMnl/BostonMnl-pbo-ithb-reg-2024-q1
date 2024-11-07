package Quiz1.model.classes;

public class Bisnis extends Penumpang {
    private int km;
    private boolean afirmasi;

    public Bisnis() {

    }

    public Bisnis(String nama, int bagasi, int km) {
        super(nama, bagasi);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAfirmasi() {
        return afirmasi;
    }

    public void setAfirmasi(boolean afirmasi) {
        this.afirmasi = afirmasi;
    }

    @Override
    public double hitungKm() {
        return getKm() * 10000;
    }

    @Override
    public double hitungKg() {
        if (getBagasi() > 5) {
            return getBagasi() * 2500;
        } else {
            return 0;
        }
    }

    @Override
    public double totalHarga() {
        if (afirmasi) {
            return hitungKg() + hitungKm() + ((hitungKg() + hitungKm()) * 0.1) + 5000;
        } else {
            return hitungKm() + hitungKg() + 5000;
        }
    }

    @Override
    public String printData() {
        return super.printData() + "\nKM : " + getKm() + "\nAfirmasi : " + isAfirmasi() + "\nTotal Harga : " + totalHarga();
    }
}
