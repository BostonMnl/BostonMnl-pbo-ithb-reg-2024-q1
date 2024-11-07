package Quiz1.model.classes;

public class Ekonomi extends Penumpang {
    private int km;

    public Ekonomi() {

    }

    public Ekonomi(String nama, int bagasi, int km) {
        super(nama, bagasi);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public double hitungKm() {
        return getKm() * 7500;
    }

    @Override
    public double hitungKg() {
        if (getBagasi() > 5) {
            return getBagasi() * 1500;
        } else {
            return 0;
        }
    }

    @Override
    public double totalHarga() {
        return hitungKm() + hitungKg() + 5000;
    }

    @Override
    public String printData() {
        return super.printData() + "\nKM : " + getKm() + "\nTotal Harga : " + totalHarga();
    }
}
