/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 20 April 2020
	Waktu	: 00.57 WITA
*/

public class TestMobil {
public static void main(String[] args){
Mobil mobil = new Mobil(){
public void injakPedalGas(){
System.out.println("Mobil berjalan...");
}
@Override
public int berukuran(int ukuran) {
return ukuran*10;
}
@Override
public int berkekuatan(int kekuatan) {
return kekuatan*10;
}
};

Kijang kijang = new Kijang();
BMW bmw = new BMW();
mobil.injakPedalGas();
System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(100)+"\nBerukuran : "+ mobil.berukuran(100));

mobil = kijang;
mobil.injakPedalGas();
System.out.println("Kekuatan Kijang: "+
mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100));

mobil = bmw;
mobil.injakPedalGas();
System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100));
}
}