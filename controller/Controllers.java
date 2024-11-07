package Quiz1.controller;

import java.util.Scanner;

import Quiz1.model.classes.Bisnis;
import Quiz1.model.classes.Ekonomi;
import Quiz1.model.classes.FirstClass;
import Quiz1.views.ViewAll;

public class Controllers {
    static Scanner scn = new Scanner(System.in);

    public static void daftarTiket(){

        System.out.println("Pilih Type : \n1.Ekonomi \n2.Bisnis \n3.First Class");
        int pilihan = scn.nextInt();
        switch (pilihan) {
            case 1:
                Ekonomi userEkonomi = inputDataEkonomi();
                ViewAll.printMsg(userEkonomi.printData());
                break;
            case 2:
                Bisnis userBisnis = inputDataBisnis();
                ViewAll.printMsg(userBisnis.printData());
                break;
            case 3:
                FirstClass userFirstClass = inputDataFirstClass();
                ViewAll.printMsg(userFirstClass.printData());
                break;
            default:
                ViewAll.printMsg("Data Salah");
                break;
        }
    }

    public static Ekonomi inputDataEkonomi() {
        Ekonomi userEkonomi = new Ekonomi();
        scn.nextLine();
        System.out.print("Nama : ");
        String nama = scn.nextLine();
        System.out.print("Bagasi : ");
        int bagasi = scn.nextInt();
        System.out.print("KM : ");
        int km = scn.nextInt();

        userEkonomi.setNama(nama);
        userEkonomi.setBagasi(bagasi);
        userEkonomi.setKm(km);

        return userEkonomi;
    }

    public static Bisnis inputDataBisnis() {
        Bisnis userBisnis = new Bisnis();

        System.out.print("Nama : ");
        String nama = scn.nextLine();
        userBisnis.setNama(nama);

        System.out.print("Bagasi : ");
        int bagasi = scn.nextInt();
        userBisnis.setBagasi(bagasi);

        System.out.print("KM : ");
        int km = scn.nextInt();
        userBisnis.setKm(km);

        System.out.println("Afirmasi (true/false) : ");
        boolean afirmasi = scn.nextBoolean();
        userBisnis.setAfirmasi(afirmasi);

        return userBisnis;
    }

    public static FirstClass inputDataFirstClass() {
        FirstClass userFirstClass = new FirstClass();

        System.out.print("Nama : ");
        String nama = scn.nextLine();
        userFirstClass.setNama(nama);

        System.out.print("Bagasi : ");
        int bagasi = scn.nextInt();
        userFirstClass.setBagasi(bagasi);

        System.out.print("KM : ");
        int km = scn.nextInt();
        userFirstClass.setKm(km);

        System.out.println("Asuransi (true/false) : ");
        boolean asuransi = scn.nextBoolean();
        userFirstClass.setAsuransi(asuransi);

        return userFirstClass;
    }
}
