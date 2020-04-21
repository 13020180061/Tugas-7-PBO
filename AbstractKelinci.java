/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 22.28 WITA
*/  

public class AbstractKelinci extends AbstractHewan {
    public void setName(){
      System.out.println("Nama hewan adalah \"KELINCI\"");
    }
     
    public void setMakanan(){
      System.out.println("Makanan kelinci adalah \"WORTEL\"");
    }
     
     public void setWarna(){
      System.out.println("Warna kelinci \"PUTIH\"");
    }
     
    public static void main(String[] args){
      AbstractKelinci k = new AbstractKelinci();
      k.setName();
      k.setMakanan();
      k.setWarna();
    }
 }