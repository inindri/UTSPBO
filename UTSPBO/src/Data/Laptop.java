/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Asus
 */
public class Laptop {
    private String Nama, Brand, namaProsesor, SO, jenisStorage;
    private int Stok, jumlahCore, ukuran;
    
    public Laptop(String Nama, String Brand, String namaProsesor, int jumlahCore, 
            String SO, int ukuran, String jenisStorage, int Stok){
        
        this.Nama = Nama; 
        this.Brand = Brand; 
        this.namaProsesor = namaProsesor; 
        this.jumlahCore = jumlahCore; 
        this.SO = SO; 
        this.ukuran = ukuran; 
        this.jenisStorage = jenisStorage; 
        this.Stok = Stok; // Stok Lapto
    }
    /* Overloading Constructor */
    public Laptop(){
        this.Nama = "unidentified"; 
        this.Brand = "unidentified"; 
        this.namaProsesor = "unidentified"; 
        this.jumlahCore = 0; 
        this.SO = "unidentified"; 
        this.ukuran = 0; 
        this.jenisStorage = "unidentified"; 
        this.Stok = 0; 
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getnamaProsesor() {
        return namaProsesor;
    }

    public void setnamaProsesor(String namaProsesor) {
        this.namaProsesor = namaProsesor;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getjenisStorage() {
        return jenisStorage;
    }

    public void setjenisStorage(String jenisStorage) {
        this.jenisStorage = jenisStorage;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getjumlahCore() {
        return jumlahCore;
    }

    public void setjumlahCore(int jumlahCore) {
        this.jumlahCore = jumlahCore;
    }

    public int getukuran() {
        return ukuran;
    }

    public void setukuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
    public void getAllLaptopData(){
        System.out.println("Nama : "+ Nama);
        System.out.println("Brand : "+ Brand);
        System.out.println("Prosesor : "+ namaProsesor);
        System.out.println("Jumlah Core pada prosesor : "+ jumlahCore);
        System.out.println("Sistem Operasi : "+ SO);
        System.out.println("Ukuran RAM dalam GB : "+ ukuran);
        System.out.println("Jenis Storage : "+ jenisStorage);
        System.out.println("Stok  : "+ Stok);
    }
}
