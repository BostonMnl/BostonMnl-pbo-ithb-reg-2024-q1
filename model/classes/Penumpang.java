package Quiz1.model.classes;

import Quiz1.model.interfaces.Action;

public abstract class Penumpang implements Action {
    private String nama;
    private int bagasi;

    public Penumpang() {

    }

    public Penumpang(String nama,int bagasi) {
        this.nama = nama;
        this.bagasi = bagasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBagasi() {
        return bagasi;
    }

    public void setBagasi(int bagasi) {
        this.bagasi = bagasi;
    }

    @Override
    public double hitungKg() {
        return 0;
    }

    @Override
    public double hitungKm() {
        return 0;
    }

    @Override
    public double totalHarga() {
        return 0;
    }

    @Override
    public String printData() {
        return "Nama : " + getNama() + "\nBagasi : " + getBagasi();
    }
}
