/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Asus
 */
public class Axioo extends Laptop{
   public Axioo(String Nama, String namaProsesor, int jumlahCore, 
            String SO, int ukuran, String jenisStorage, int Stok){
            
            super(Nama, "Axioo", namaProsesor, jumlahCore, SO, ukuran, jenisStorage, Stok);    
    }
    
    public Axioo(){
        super();
        super.setBrand("Axioo");
    }
    
    public void AxiooSlogan(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Axioo is build for you");
        System.out.println("=======================");
        
    }
    
    @Override
    public void getAllLaptopData(){
        AxiooSlogan();
        super.getAllLaptopData();
        System.out.println("");
    }
    
    @Override
    public void setukuran(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Ukuran RAM tidak dapat lebih kecil dari nol!");
            System.out.println("Ukuran RAM diatur ke default (4 GB)");
            System.out.println("");
            super.setukuran(4);
        }
    }
    
    @Override
    public void setjumlahCore(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");
            System.out.println("");
            super.setjumlahCore(2);
        }
    }
    
    @Override
    public void setStok(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            System.out.println("");
            super.setStok(0);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String getStorePositionLaptop(){
        String storage = super.getjenisStorage().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" :
                return "Best";
            
            case "ssdsata" :
                return "Good";
            
            case "hdd" :
                return "Middle";
            
            default :
                    return "unidentified";
            }
        }
    }