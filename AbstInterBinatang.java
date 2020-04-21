/*
    	Nama	: St.Hatijah H.Ilyas
	Stambuk : 13020180061
	Tanggal	: 19 April 2020
	Waktu	: 23.20 WITA
*/  

public abstract class AbstInterBinatang{
 protected String nama;
 protected int jmlKaki;

  public AbstInterBinatang(String nama, int jmlKaki){
  this.nama=nama;
  this.jmlKaki=jmlKaki;
 }
  public void setNama(String nama){
  this.nama=nama;
 }
 public String getNama(){
  return nama;
 }
 public void setKaki(int jmlKaki){
  this.jmlKaki=jmlKaki;
 }
 public int getKaki(){
  return jmlKaki;
 }
 public void displayBinatang(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 }