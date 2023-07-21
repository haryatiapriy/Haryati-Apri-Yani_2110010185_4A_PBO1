package PBO;

//class
public class Mobil {
   //object, atribut dan encapsulation
    private String nama;
    private String warna;
    private String tahun;

    //constructor
    public Mobil(String nama, String warna, String tahun) {
        this.nama = nama;
        this.warna = warna;
        this.tahun = tahun;
    }

    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public String getTahun() {
        return tahun;
    }
    
    public String displayInfo(){
        return "Nama:"+getNama()+"\nWarna:"+getWarna()+"\nTahun:"+getTahun();
    }
    
    //polymophism (overloading)
    public String displayInfo(String Tipe){
        return displayInfo() +"\nTipe: "+Tipe;
    }
    
}
