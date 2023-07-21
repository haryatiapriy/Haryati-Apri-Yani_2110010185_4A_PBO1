package PBO;

//inheritance
public class MobilDetail extends Mobil {
    //overriding
    public MobilDetail(String nama, String warna, String tahun) {
        super(nama, warna, tahun);
    }
    
    public int getMerek() {
        return Integer.parseInt(getTahun().substring(0, 2));
    }
    
    public String getTransmisi(){
        String kodeTrans = getTahun().substring(2, 4);
        //seleksi if
        if(kodeTrans.equals("23")){
            return "Matic";
        } else {
            return "Transmisi lain";
        }
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nMerek: "+getMerek()+
                "\nTransmisi: "+getTransmisi();
    }
}

