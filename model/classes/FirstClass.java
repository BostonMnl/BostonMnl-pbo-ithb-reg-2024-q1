package Quiz1.model.classes;

public class FirstClass extends Penumpang {
    private int km;
    private boolean asuransi;

    public FirstClass() {

    }

    public FirstClass(String nama, int bagasi, int km) {
        super(nama, bagasi);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    @Override
    public double hitungKm() {
        return getKm() * 15000;
    }

    @Override
    public double totalHarga() {
        if (asuransi) {
            return hitungKm() + (hitungKm()*0.1);
        }else{
            return hitungKm();
        }
    }

    @Override
    public String printData() {
        return super.printData() + "\nKM : " + getKm() + "\nAsuransi : " + isAsuransi() + "\nTotal Harga : " + totalHarga();
    }
}
