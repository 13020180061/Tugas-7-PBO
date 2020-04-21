/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 23.50 WITA
*/  

public class InheriInterLapTahunan implements InheriInterCetakLap, InheriInterTampilLap{
    public void cetakA4(){
        System.out.println("Cetak Laporan di A4");
    }
    public void cetakA3(){
        System.out.println("Cetak Laporan di A3");
    }
    public void tampilWeb(){
        System.out.println("Tampil di Monitor");
    }
    public void tampilMobile(){
        System.out.println("Tampil di Handphone");
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        InheriInterLapTahunan lt = new InheriInterLapTahunan();
        lt.cetakA3();
        lt.cetakA4();
        lt.tampilMobile();
        lt.tampilWeb();
    }
}